package edu.njtu.spark


import org.apache.spark.mllib.evaluation.RankingMetrics
import org.apache.spark.mllib.recommendation.{ALS, MatrixFactorizationModel, Rating}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.jblas.DoubleMatrix

import scala.collection.Map


class Recommend2 {
  def main(args: Array[String]) {
    //创建spark context
    val conf = new SparkConf().setAppName("test").setMaster("local[*]")
    val sc = new SparkContext(conf)
    //用户 电影 评分
    val rawData: RDD[String] = sc.textFile("file:")
    //去掉时间的字段,rawRatings:Array
    val rawRatings = rawData.map(_.split("\\t").take(3))
    //user moive rating
    val ratings = rawRatings.map{case Array(user, movie, rating) =>{
      Rating(user.toInt, movie.toInt, rating.toDouble)
    }}
    val doubleValue: Double = 0.01

    val model = ALS.train(ratings,50,10,0.01)


    val itemFactors: Array[Array[Double]] = model.productFeatures.map{case (id, factor) => factor}.collect()
    val itemMatrix: DoubleMatrix = new DoubleMatrix(itemFactors)
    println(itemMatrix.rows, itemMatrix.columns)

    val allRecs = model.userFeatures.map{case (userId,factor) => {
      val userVector = new DoubleMatrix(factor)
      val scores = itemMatrix.mmul(userVector)
      val sortedWithId = scores.data.zipWithIndex.sortBy(-_._1);
      val recommendIds = sortedWithId.map(-_._2 + 1).toSeq
      (userId,recommendIds)

    }}

    val userMovies: RDD[(Int,Iterable[(Int,Int)])] = ratings.map{ case Rating(user, product, rating) => {
        (user,product)
      }}.groupBy(_._1)

    val predictedAndTrueForRanking = allRecs.join(userMovies).map{
      case(userId,(predicted,actualWithIds)) =>{
        val actual = actualWithIds.map(_._2)
        (actual.toArray,predicted.toArray)
      }
    }

    val rankingMetrics: RankingMetrics[Int] = new RankingMetrics(predictedAndTrueForRanking)
    println("使用内置的计算MAP：" + rankingMetrics.meanAveragePrecision)

  }
}
