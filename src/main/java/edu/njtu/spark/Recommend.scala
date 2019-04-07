package edu.njtu.spark

;

import org.apache.spark.ml.recommendation
import org.apache.spark.mllib.evaluation.{RankingMetrics, RegressionMetrics}
import org.apache.spark.mllib.recommendation.{ALS, Rating}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.jblas.DoubleMatrix

import scala.collection.Map

/**
  * 基于Spark MLlib 的推荐算法
  * ALS：最小二乘法
  *
  * @author lwj
  * @date 2018/05/04
  */
object Recommend {
  /**
    * 用于商品推荐
    * 通过传入两个向量，返回这两个向量之间的余弦相似度
    *
    * @param vec1
    * @param vec2
    * @return
    */
  def cosineSimilarity(vec1: DoubleMatrix, vec2: DoubleMatrix): Double = {
    vec1.dot(vec2) / (vec1.norm2() * vec2.norm2())
  }

  /**
    * 模型评估
    * K值平均准确率(APK)
    *
    * @param actual
    * @param predicted
    * @param k
    * @return
    */
  def avgPrecisionK(actual: Seq[Int], predicted: Seq[Int], k: Int): Double = {
    val predK: Seq[Int] = predicted.take(k)
    var score = 0.0
    var numHits = 0.0
    for ((p, i) <- predK.zipWithIndex) {
      if (actual.contains(p)) {
        numHits += 1.0
        score += numHits / (i.toDouble + 1.0) //TODO 为什么除以i.toDouble
      }
    }
    if (actual.isEmpty) {
      1.0
    } else {
      score / math.min(actual.size, k).toDouble //TODO 为什么是min
    }
  }


  def main(args: Array[String]) {
    //        StreamingExamples.setStreamingLogLevels()
    val conf = new SparkConf().setAppName("recommandTest").setMaster("local[*]")
    val sc = new SparkContext(conf)
    /*用户 电影 评分*/
    val rawData: RDD[String] = sc.textFile("file:///E:/spark/ml-100k/u.data")
    //去掉时间的字段，rawRatings:Array
    val rawRatings = rawData.map(_.split("\\t").take(3))
    //user moive rating
    val ratings = rawRatings.map { case Array(user, movie, rating) => {
      recommendation.ALS.Rating("abc","abc",134)
      Rating(user.toInt, movie.toInt, rating.toDouble)
    }
    }
    //电影
    val movies: RDD[String] = sc.textFile("file:///E:/spark/ml-100k/u.item")
    //电影ID 电影名
    val titles: Map[Int, String] = movies.map(_.split("\\|").take(2)).map(array => (array(0).toInt, array(1))).collectAsMap()
    /**
      * 得到训练的模型
      * 注意：50代表我们得到的模型的因子的列的数量，名称叫 因子维数
      */
    val model = ALS.train(ratings, 50, 10, 0.01)

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
    val userID = 789
    val K = 10
    val topKRecs: Array[Rating] = model.recommendProducts(userID, 10)
    val oneProduct = topKRecs.apply(0)

    //  println(topKRecs.mkString("\n"))

    //获取指定用户所评价过的电影
    val moviesForUser: Seq[Rating] = ratings.keyBy(_.user).lookup(789)

    //打印出指定用户评价最高的10部电影的名称和评分
    println("真实的：")
    moviesForUser.sortBy(-_.rating).take(10).map(rating => {
      (titles(rating.product), rating.rating)
    }).foreach(println)

    //打印出推荐给用户的10部电影的名称和评分，和上面的进行比较
    println("推荐的：")
    topKRecs.map(rating => {
      (titles(rating.product), rating.rating)
    }).foreach(println)


    println("\n-----------------------\n")

    /**
      * 基于商品进行推荐
      */
    /*通过商品ID获得与该商品相似的商品*/
    val itemId = 567
    val itemFactor: Array[Double] = model.productFeatures.lookup(itemId).head
    val itemVector: DoubleMatrix = new DoubleMatrix(itemFactor)
    //获得每个商品与给出的商品的余弦相似度
    val sims = model.productFeatures.map { case (id, factor) => {
      val factorVector = new DoubleMatrix(factor)
      val sim = cosineSimilarity(factorVector, itemVector)
      (id, sim)
    }
    }
    //打印出前N的商品
    val topItem: Array[(Int, Double)] = sims.sortBy(-_._2).take(10 + 1)
    println("与567商品相似的商品：\n" + topItem.mkString("\n") + "\n")

    /*校验商品*/
    println("给定的商品名称为： " + titles(itemId))
    println("相似的商品名称为：")
    topItem.slice(1, 11).foreach(item => println(titles(item._1)))


    println("\n-----------------------\n")

    /*模型评估*/
    /**
      * 均方差评估
      * 对model全量数据进行评估
      */
    //    val actualRating: Rating = moviesForUser.take(1)(0)
    //    val predictedRating: Double = model.predict(789, actualRating.product)
    //    println("\n真实分：" + actualRating.rating + "  预测分：" + predictedRating)
    //格式：(userID，电影)
    val userProducts: RDD[(Int, Int)] = ratings.map(rating => (rating.user, rating.product))
    //模型推测出的评分信息，格式为：((userID，电影), 推测评分)
    val predictions: RDD[((Int, Int), Double)] = model.predict(userProducts).map(rating => ((rating.user, rating.product), rating.rating))
    //格式为：((userID，电影), (真实平评分，推测评分))
    val ratingsAndPredictions: RDD[((Int, Int), (Double, Double))] = ratings.map(rating => ((rating.user, rating.product), rating.rating))
      .join(predictions)
    //均方差
    val MSE = ratingsAndPredictions.map(rap => math.pow(rap._2._1 - rap._2._2, 2)).reduce(_ + _) / ratingsAndPredictions.count()
    println("均方差MSE为： " + MSE)
    //均方根误差
    val RMSE: Double = math.sqrt(MSE)
    println("均方根误差RMSE为： " + RMSE)

    /**
      * K值平均准确率评估
      * 注意：该评估模型是针对对用户感兴趣和回去接触的物品的预测能力
      * 也是就是说：这时针对基于用户推荐的 模型的评估
      */
    /*计算 单个 指定用户推荐的APK指标*/
    val actualMovies: Seq[Int] = moviesForUser.map(_.product)
    val predictedMovies: Array[Int] = topKRecs.map(_.product)
    val apk10: Double = avgPrecisionK(actualMovies, predictedMovies, 10)
    println("789的APK值为：" + apk10)

    /*获取模型中所有商品的 factor，并转换成矩阵*/
    val itemFactors: Array[Array[Double]] = model.productFeatures.map { case (id, factor) => factor }.collect()
    val itemMatrix: DoubleMatrix = new DoubleMatrix(itemFactors)
    //    println(itemMatrix.rows, itemMatrix.columns)

    /*获得模型中每个用户对应的每个电影的评分*/
    val allRecs = model.userFeatures.map { case (userId, factor) => {
      val userVector = new DoubleMatrix(factor)
      /**
        * socres是一个DoubleMatrix类型，值为1行N列的 Vector
        * 为什么可以通过判断这两个矩阵的乘积的大小，从而来判断分数呢？
        * 这归根于ALS算法，该算法是将一个 用户-商品 的矩阵 拆分成 用户、商品两个矩阵
        * 因此这两个矩阵的乘积就是实际的 分数
        */
      val scores = itemMatrix.mmul(userVector)
      //矩阵和向量的乘积，求出每个用户的分数
      //根据评分倒数排序
      val sortedWithId = scores.data.zipWithIndex.sortBy(-_._1)
      //(score, itemId)
      val recommendIds = sortedWithId.map(_._2 + 1).toSeq
      //返回用户 和 各个商品评分的倒数的值 的 tuple: (userId,(sorce, itemId))
      (userId, recommendIds)
    }
    }

    /*获取实际中的 每个用户对应的有评分过的电影的评分*/
    val userMoives: RDD[(Int, Iterable[(Int, Int)])] = ratings.map { case Rating(user, product, rating) => {
      (user, product)
    }
    }.groupBy(_._1)

    val MAPK = allRecs.join(userMoives).map { case (userId, (predicted, actualWithIds)) => {
      //实际的商品编号
      val actual = actualWithIds.map(_._2).toSeq
      avgPrecisionK(actual, predicted, 10)
    }
    }.reduce(_ + _) / allRecs.count

    println("MAPK：" + MAPK)


    println("\n-----------------------\n")

    /**
      * 使用MLlib内置的评估器
      */
    /*RMSE 和 MSE*/
    val predictedAndTrue: RDD[(Double, Double)] = ratingsAndPredictions.map { case ((userID, product), (actual, predict)) => (actual, predict) }
    val regressionMetrics: RegressionMetrics = new RegressionMetrics(predictedAndTrue)
    println("使用内置的计算MSE：" + regressionMetrics.meanSquaredError)
    println("使用内置的计算RMSE：" + regressionMetrics.rootMeanSquaredError)

    /*MAPK*/
    val predictedAndTrueForRanking = allRecs.join(userMoives).map { case (userId, (predicted, actualWithIds)) => {
      //实际的商品编号
      val actual = actualWithIds.map(_._2)
      (actual.toArray, predicted.toArray)
    }
    }
    val rankingMetrics: RankingMetrics[Int] = new RankingMetrics(predictedAndTrueForRanking)
    println("使用内置的计算MAP：" + rankingMetrics.meanAveragePrecision)


  }
}
