package edu.njtu.spark;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.mllib.evaluation.RankingMetrics;
import org.apache.spark.mllib.recommendation.MatrixFactorizationModel;
import org.apache.spark.mllib.recommendation.Rating;
import org.apache.spark.mllib.recommendation.ALS;
import org.apache.spark.rdd.RDD;
import org.apache.spark.SparkContext;
import org.apache.spark.SparkConf;
import org.codehaus.janino.Java;
import org.jblas.DoubleMatrix;

import scala.Array;
import scala.collection.Map;
import scala.collection.immutable.Seq;

import java.util.Arrays;
import java.util.List;


public class Recommend3 {
    public void abc(){
        SparkConf conf = new SparkConf().setAppName("test").setMaster("local[*]");
        SparkContext sc = new SparkContext(conf);
        RDD<String> rawDataScala = sc.textFile("xxx", 1);


        JavaRDD<String> rawData = rawDataScala.toJavaRDD();
        JavaRDD<List<String>> rawRating = rawData.map(s -> {

            String [] array = s.split("\\t");
            List<String> list = Arrays.asList(array);
            return list;
        });

        JavaRDD<Rating> ratingJava = rawRating.map(strings -> {
            return new Rating(Integer.parseInt(strings.get(0)), Integer.parseInt(strings.get(1)), Double.parseDouble((strings.get(2))));
        });
        RDD<Rating> rating = rawRating.toRDD(ratingJava);


        MatrixFactorizationModel model = ALS.train(rating, 50, 10, 0.01);
        //    val itemFactors: Array[Array[Double]] = model.productFeatures.map{case (id, factor) => factor}.collect()
        List<double[]> itemFactors = model.productFeatures().toJavaRDD().map(v -> v._2).collect();

        DoubleMatrix itemMatrix = new DoubleMatrix((double[][]) itemFactors.toArray());
//        model.userFeatures().toJavaRDD().map(objectTuple2 -> {
//            DoubleMatrix userVector = new DoubleMatrix(objectTuple2._2);
//            DoubleMatrix scores = itemMatrix.mmul(userVector);
//
//            DoubleMatrix sortWithId = scores.sort();
//
//
//
//        });







    }
}
