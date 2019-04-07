package edu.njtu.spark

import org.apache.spark.sql.{SQLContext, SparkSession}

class DataInit {



  def main(args: Array[String]) {
    val session = SparkSession.builder()
      .master("local[*]")
      .appName(this.getClass.getSimpleName)
      .getOrCreate()

    // 导入隐式转换和functions
    import session.implicits._
    import org.apache.spark.sql.types._
    import org.apache.spark.sql.functions._

    val sqlContext = session.sqlContext
    val dfs = sqlContext.read.json("D:\\Yun\\Yun2018\\软件架构和云服务\\data\\temp.json")
    //显示数据
    dfs.show()
    //查看数据结构
    dfs.printSchema()


  }





}
