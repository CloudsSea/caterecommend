package edu.njtu.spark

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
//    val rawData: RDD[String] = sc.textFile("file:///E:/spark/ml-100k/u.data")

    val sqlcontext = new SQLContext(sc);
    val dfs = sqlcontext.read.json("D:\\Yun\\Yun2018\\软件架构和云服务\\data\\reviewforscala.json")
//    查看某一列
//      dfs.select("name").show()
//    查找年龄大于23（age> 23）的雇员。
//    dfs.filter(dfs("age") > 23).show()
//    计算同一年龄的员工人数。
//    dfs.groupBy("age").count().show()
    dfs.printSchema()
    dfs.createOrReplaceTempView("review")
    case class Review(business_id: String, user_id: String,star:Long)
    val rawRatingsSql = sqlcontext.sql("select user_id,business_id,stars from review")
    val temp = rawRatingsSql.rdd;
    val rawRatings : RDD[Array[String]] = temp.map { row =>{
      Array(row.get(0).toString,row.get(1).toString,row.get(2).toString)
    }}
    //去掉时间的字段，rawRatings:Array
//    val rawRatings = rawData.map(_.split("\\t").take(3))
    //user moive rating
    val ratings = rawRatings.map { case Array(user, business, rating) => {
      Rating(user.toInt, business.toInt, rating.toFloat)
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
    //  println(mode.userFeatures.count())
    //商品因子的数量
    //  println(mode.productFeatures.count())
    //查看某个用户对某个商品的预测评分，ALS模型的初始化是随机的，所以产生的结果可能会不同
    //  println(mode.predict(789, 123))

    //为指定的用户推荐 N 个商品

//    val userID = 789
//    val K = 10
//    val topKRecs: Array[Rating] = model.recommendProducts(userID, 10)
//    val oneProduct = topKRecs.apply(0)

    //  println(topKRecs.mkString("\n"))

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
