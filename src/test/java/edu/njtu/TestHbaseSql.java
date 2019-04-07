package edu.njtu;

import edu.njtu.config.HBaseConfig;
import edu.njtu.hbase.HBaseUtils;
import edu.njtu.service.HBaseService;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * 测试Hbase SQL
 * @author zifangsky
 * @date 2018/7/3
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class TestHbaseSql {

    @Autowired
    private HBaseUtils hBaseUtils;
    //private HBaseService hBaseUtils;
    protected  static Connection conn;
    private static final String ZK_QUORUM = "hbase.zookeeper.quorum";
    private static final String ZK_CLIENT_PORT = "hbase.zookeeper.property.clientPort";
    private static final String HBASE_POS = "100.168.1.182";
    private static final String ZK_POS = "Master:2181,Slave0:2181,Slave1:2181,Slave2:2181";
    private static final String ZK_PORT_VALUE = "2181";

    /*** 静态构造，在调用静态方法前运行，  初始化连接对象  * */
//    static {
//        Configuration config = HBaseConfiguration.create();
//        config.set("hbase.rootdir", "hdfs://"+ HBASE_POS + ":9000/hbase");
//        config.set(ZK_QUORUM, ZK_POS);
//        config.set(ZK_CLIENT_PORT, ZK_PORT_VALUE);
//        //创建连接池
//        try {
//            conn = ConnectionFactory.createConnection(config);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

    /**
     * 测试删除、创建表
     */
    @Test
    public void testCreateTable() {
//        //删除表
//        Configuration config = HBaseConfiguration.create();
//
//        try {
////            hBaseUtils.deleteTable("test_base");
//
//            HTable table = new HTable(config, "yun");
//            byte[] row = Bytes.toBytes("kr001");
//            Put put = new Put(row);
//            put.add(Bytes.toBytes("info"), Bytes.toBytes("name"), Bytes.toBytes("yun"));
//            put.add(Bytes.toBytes("info"), Bytes.toBytes("age"), Bytes.toBytes("yun"));
//            put.add(Bytes.toBytes("info"), Bytes.toBytes("name"), Bytes.toBytes("10000"));
//
//            String tableName = "yun";
//            String rowKey = "shang";
//            String columnFamily = "age";
//            String column ="xian";
//            String value = "haha";
            //addRow(tableName, rowKey, columnFamily, column, value);

            //创建表
//            hBaseUtils.createTableBySplitKeys("test_base", Arrays.asList("f", "back"), hBaseUtils.getSplitKeys(null));
//
//            //插入三条数据
//            hBaseUtils.putData("test_base", "66804_000001", "f", new String[]{"project_id", "varName", "coefs", "pvalues", "tvalues", "create_time"}, new String[]{"40866", "mob_3", "0.9416", "0.0000", "12.2293", "null"});
//            hBaseUtils.putData("test_base", "66804_000002", "f", new String[]{"project_id", "varName", "coefs", "pvalues", "tvalues", "create_time"}, new String[]{"40866", "idno_prov", "0.9317", "0.0000", "9.8679", "null"});
//            hBaseUtils.putData("test_base", "66804_000003", "f", new String[]{"project_id", "varName", "coefs", "pvalues", "tvalues", "create_time"}, new String[]{"40866", "education", "0.8984", "0.0000", "25.5649", "null"});
//
//            //查询数据
//            //1. 根据rowKey查询
//            Map<String, String> result1 = hBaseUtils.getRowData("test_base", "66804_000001");
//            System.out.println("+++++++++++根据rowKey查询+++++++++++");
//            result1.forEach((k, value) -> {
//                System.out.println(k + "---" + value);
//            });
//            System.out.println();
//
//            //精确查询某个单元格的数据
//            String str1 = hBaseUtils.getColumnValue("test_base", "66804_000002", "f", "varName");
//            System.out.println("+++++++++++精确查询某个单元格的数据+++++++++++");
//            System.out.println(str1);
//            System.out.println();
//
//            //2. 遍历查询
//            Map<String, Map<String, String>> result2 = hBaseUtils.getResultScanner("test_base");
//            System.out.println("+++++++++++遍历查询+++++++++++");
//            result2.forEach((k, value) -> {
//                System.out.println(k + "---" + value);
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
// 2.添加一条数据
    public static void addRow(String tableName, String rowKey, String columnFamily, String column, String value) throws IOException {
        HTable table = (HTable) conn.getTable(TableName.valueOf(tableName));
        Put put = new Put(Bytes.toBytes(rowKey));//通过rowKey创建一个put对象
        //在put对象中设置列名,列,值
        put.addColumn(Bytes.toBytes(columnFamily), Bytes.toBytes(column),Bytes.toBytes(value));

        table.put(put);
        table.close();
        conn.close();
    }

    public static void getRow(String tableName,String rowKey) throws IOException {
        HTable table = (HTable) conn.getTable(TableName.valueOf(tableName));
        Get get = new Get(Bytes.toBytes(rowKey));//通过rowKey创建一个get对象
        Result result = table.get(get);
        for (Cell cell : result.rawCells()) {
            System.out.println(
                    "abc" + new String(CellUtil.cloneRow(cell))
            );

        }
        table.close();
        conn.close();
    }

    public static void scanTable(String tableName) throws IOException {
        HTable table = (HTable) conn.getTable(TableName.valueOf(tableName));

        Scan scan = new Scan();
        ResultScanner results = table.getScanner(scan);
        for (Result result : results) {
            for (Cell cell : result.rawCells()) {

            }
        }

        results.close();
        table.close();
        conn.close();

    }

    public static void delRow(String tableName, String rowKey) throws IOException {


    }


}