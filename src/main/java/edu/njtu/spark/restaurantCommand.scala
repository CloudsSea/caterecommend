package edu.njtu.spark

import DataStructureAndAlgorithm.DBTools
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.recommendation.{ALS, MatrixFactorizationModel, Rating}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SQLContext

import scala.collection.Map

object restaurantCommand {
  def main(args: Array[String]) {
    //        StreamingExamples.setStreamingLogLevels()
    val conf = new SparkConf().setAppName("recommandTest").setMaster("local[*]")
    val sc = new SparkContext(conf)
    /*用户 电影 评分*/
    val rawData: RDD[String] = sc.textFile("D:\\Yun\\Yun2018\\软件架构和云服务\\data\\data.txt")
    //user moive rating
    val rawRatings = rawData.map(_.split("\\t").take(3))


    //val model = ALS.train(ratings,50,10,0.01)


    //    查看某一列
//      dfs.select("name").show()
//    查找年龄大于23（age> 23）的雇员。
//    dfs.filter(dfs("age") > 23).show()
//    计算同一年龄的员工人数。
//    dfs.groupBy("age").count().show()

    //去掉时间的字段，rawRatings:Array
//    val rawRatings = rawData.map(_.split("\\t").take(3))
    //user moive rating

    val ratings = rawRatings.map{case Array(user, movie, rating) =>{
      Rating(user.toInt, movie.toInt, rating.toDouble)
    }}


    //电影
   // val movies: RDD[String] = sc.textFile("file:///E:/spark/ml-100k/u.item")
    //电影ID 电影名
    //val titles: Map[Int, String] = movies.map(_.split("\\|").take(2)).map(array => (array(0).toInt, array(1))).collectAsMap()
    /**
      * 得到训练的模型
      * 注意：50代表我们得到的模型的因子的列的数量，名称叫 因子维数
      *https://blog.csdn.net/u012834750/article/details/81560971
      * numUserBlocks: Int = 10, //分区数
      * numItemBlocks: Int = 10,
      * maxIter: Int = 10,   //迭代次数
      */
    val model = ALS.train(ratings,50,10,0.01)

    /**
      * 基于用户进行推荐
      */
    //用户因子的数量

    println("----------------->用户因子的数量")
    println(model.userFeatures.count())
    val total = model.userFeatures.count();
    //商品因子的数量
    println("----------------->商品因子的数量")
    println(model.productFeatures.count())
    //查看某个用户对某个商品的预测评分，ALS模型的初始化是随机的，所以产生的结果可能会不同
    println("----------------->某个用户对某个商品的预测评分")
    println(model.predict(789, 123))


    val connection = DBTools.getConnection
    val statement = connection.createStatement()

    //为指定的用户推荐 N 个商品
    val K = 10
    var a = 1
    // for 循环
    do{
      val topKRecs: Array[Rating] = model.recommendProducts(a, K)
      println(topKRecs.mkString("\n"))
      var product : Rating = null
      for(product <- topKRecs){
        val business_id = product.product
        val user_id = product.user
        val rating = product.rating
        val theValue = "'"+user_id+"'," + "'"+business_id+"'," + "'"+rating+"'"
        println("----------------->为指定的用户推荐 N 个商品")
        try {
          statement.executeUpdate("INSERT INTO `recommend_user` (`user_id_int`, `business_id_int`,`recommend_value`) VALUES ("+theValue+")")
        }catch {
          case e: Exception => e.printStackTrace
        }
      }
      a = a+1


    }while(a < 501)




    connection.close()





//    //获取指定用户所评价过的电影
//    val moviesForUser: Seq[Rating] = ratings.keyBy(_.user).lookup(789)
//
//    //打印出指定用户评价最高的10部电影的名称和评分
//    println("真实的：")
//    moviesForUser.sortBy(-_.rating).take(10).map(rating => {
//      (titles(rating.product), rating.rating)
//    }).foreach(println)
//
//    //打印出推荐给用户的10部电影的名称和评分，和上面的进行比较
//    println("推荐的：")
//    topKRecs.map(rating => {
//      (titles(rating.product), rating.rating)
//    }).foreach(println)


    println("\n-----------------------\n")
  }
}
