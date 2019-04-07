package edu.njtu.spark;

import com.alibaba.fastjson.JSONObject;
import edu.njtu.mapper.*;
import edu.njtu.model.*;
import edu.njtu.model.ori.Attributes;
import edu.njtu.model.ori.Business;
import edu.njtu.model.ori.Hours;
import edu.njtu.tools.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SQLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import scala.Tuple2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service("test2")
public class Test2 {
    private static Logger logger = LoggerFactory.getLogger(Test2.class);
    static SparkConf conf = null;
    static JavaSparkContext sc = null;
    static SQLContext sqlContext = null;

//    static {
//        conf = new SparkConf();
//        conf.setMaster("local").setAppName("TestTransformation");
//        sc = new JavaSparkContext(conf);
//        sqlContext = new SQLContext(sc);
//    }


    public BusinessMapper businessMapper;
    public AmbienceMapper ambienceMapper;
    public CategoriesMapper categoriesMapper;
    public DietaryRestrictionsMapper dietaryRestrictionsMapper;
    public GoodForMapper goodForMapper;
    public HairTypesSpecializedInMapper hairTypesSpecializedInMapper ;
    public HoursMapper hoursMapper;
    public BusMidCategoryMapper busMidCategoryMapper;
    public MusicMapper musicMapper;
    public NeighborhoodMapper neighborhoodMapper;
    public ParkingMapper parkingMapper;

    public static void map() {
        //String[] names = {"张无忌","赵敏","周芷若"};

        List<String> list = Arrays.asList("张无忌", "赵敏", "周芷若");
        JavaRDD<String> listRdd = sc.parallelize(list);
        JavaRDD<String> nameRdd = listRdd.map(s -> "hello," + s);
        nameRdd.foreach(s -> System.out.println(s));

    }


    public void readFile() {
        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilterdBusiness_format.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\tempcut.json";
//        Dataset dfs = sqlContext.read().json(filePath);
//        List<String> jsonList = dfs.toJSON().collectAsList();
        logger.info("=====================================================>开始");
        List<String> jsonList = toArrayByFileReader1(filePath);

        List<Business> businessOriList = jsonList.stream().map(s -> {
            return JSONObject.parseObject(s, Business.class);
        }).collect(Collectors.toList());

        //bus_ambience
        //bus_attribute
        //bus_category
        //bus_dietary...
        //bus_good_for
        //bus_hair_types_..
        //bus_hours
        //bus_mid_category
        //bus_music
        //bus_neighborhood
        //bus-parking
        //bus




    }


    public void insertHBase() throws IOException {
        Configuration conf = HBaseConfiguration.create();
        //新版 API 中加入了 Connection，HAdmin成了Admin，HTable成了Table，
        // 而Admin和Table只能通过Connection获得。Connection的创建是个重量级的操作，
        // 由于Connection是线程安全的，所以推荐使用单例，其工厂方法需要一个HBaseConfiguration。
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        conf.set("hbase.zookeeper.quorum", "master");

        //Connection 的创建是个重量级的工作，线程安全，是操作hbase的入口
        Connection conn = ConnectionFactory.createConnection(conf);

        TableName userTable = TableName.valueOf("business");

        //创建 user 表
        HTableDescriptor tableDescr = new HTableDescriptor(userTable);
        tableDescr.addFamily(new HColumnDescriptor("basic".getBytes()));
        logger.info("Creating table `business`. ");
        Admin admin = conn.getAdmin();
        if (admin.tableExists(userTable)) {
            admin.disableTable(userTable);
            admin.deleteTable(userTable);
        }
        admin.createTable(tableDescr);
        logger.info("Done!");
    }


    public static  List<String> toArrayByFileReader1(String name) {
        // 使用ArrayList来存储每行读取到的字符串
        List<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回数组
        return arrayList;
    }

    public static void flatMap() {
        List<String> list = Arrays.asList("张无忌 赵敏", "宋青书 周芷若");
        JavaRDD<String> listRDD = sc.parallelize(list);

        listRDD.flatMap(s -> Arrays.asList(s.split(" ")).iterator()).map(s -> "hello," + s);

        listRDD.foreach(s -> System.out.println(s));
    }

    /**
     * map:
     * 一条数据一条数据的处理（文件系统，数据库等等）
     * mapPartitions：
     * 一次获取的是一个分区的数据（hdfs）
     * 正常情况下，mapPartitions 是一个高性能的算子
     * 因为每次处理的是一个分区的数据，减少了去获取数据的次数。
     * <p>
     * 但是如果我们的分区如果设置得不合理，有可能导致每个分区里面的数据量过大。
     */


    public static void mapParations() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //参数二代表这个rdd里面有两个分区
        JavaRDD<Integer> listRDD = sc.parallelize(list, 2);
        listRDD.mapPartitions(integerIterator -> {
            ArrayList<String> array = new ArrayList<>();
            while (integerIterator.hasNext()) {
                array.add("hello" + integerIterator.next());
            }
            return array.iterator();
        }).foreach(s -> System.out.println(s));

    }

    public static void mapPartitionsWithIndex() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        JavaRDD<Integer> listRDD = sc.parallelize(list, 2);
        listRDD.mapPartitionsWithIndex((integer, integerIterator) -> {
            ArrayList<String> arrayList = new ArrayList<>();
            while (integerIterator.hasNext()) {
                arrayList.add(integer + "hello" + integerIterator.next());
            }
            return arrayList.iterator();
        }, true).foreach(s -> System.out.println(s));

    }

    public static void reduce() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        JavaRDD<Integer> listRDD = sc.parallelize(list);

        int result = listRDD.reduce((integer, integer2) -> integer + integer2);
        logger.info(result + "===============================================================>");
    }

    public static void reduceByKey() {
        List<Tuple2<String, Integer>> list = Arrays.asList(
                new Tuple2<String, Integer>("武当", 99),
                new Tuple2<String, Integer>("少林", 97),
                new Tuple2<String, Integer>("武当", 89),
                new Tuple2<String, Integer>("少林", 77)
        );
        JavaPairRDD<String, Integer> listRDD = sc.parallelizePairs(list);

        JavaPairRDD<String, Integer> resultRDD = listRDD.reduceByKey((integer, integer2) -> integer + integer2);
        resultRDD.foreach(stringIntegerTuple2 -> logger.info(stringIntegerTuple2._1 + stringIntegerTuple2._2));
    }

    public static void join() {
        final List<Tuple2<Integer, String>> names = Arrays.asList(
                new Tuple2<Integer, String>(1, "东方不败"),
                new Tuple2<Integer, String>(2, "令狐冲"),
                new Tuple2<Integer, String>(3, "林平之")
        );
        final List<Tuple2<Integer, Integer>> scores = Arrays.asList(
                new Tuple2<Integer, Integer>(1, 99),
                new Tuple2<Integer, Integer>(2, 98),
                new Tuple2<Integer, Integer>(3, 97)
        );

        final JavaPairRDD<Integer, String> namesList = sc.parallelizePairs(names);
        final JavaPairRDD<Integer, Integer> scoreList = sc.parallelizePairs(scores);


    }
    public static void readTableFile(){
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredPhoto.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredReview.json";
        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredUser.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\tempcut.json";
        Dataset dfs = sqlContext.read().json(filePath);
        logger.info("=====================================================>开始");
        dfs.printSchema();
        logger.info("=====================================================>结束");
    }
    public static void main(String[] args) {
//        readFile();
        readTableFile();

    }

}