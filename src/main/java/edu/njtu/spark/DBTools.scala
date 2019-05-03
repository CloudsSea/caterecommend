
package DataStructureAndAlgorithm

/**
  * Created by Administrator on 2017/12/23.
  */
import java.sql.{ Connection, DriverManager }


object DBTools extends App {
  def getConnection() : Connection = {
    val url = "jdbc:mysql://39.105.167.124:3306/yelp_db?useUnicode=true&characterEncoding=utf-8&useSSL=false"
    //驱动名称
    //  val driver = "com.mysql.jdbc.Driver"
    val driver = "com.mysql.cj.jdbc.Driver"
    //用户名
    val username = "root"
    //密码
    val password = "123456"
    //初始化数据连接

      //注册Driver
    Class.forName(driver)
    //得到连接
    var connection = DriverManager.getConnection(url, username, password)
    return connection;
  }
  // 访问本地MySQL服务器，通过3306端口访问mysql数据库
  val url = "jdbc:mysql://39.105.167.124:3306/yelp_db?useUnicode=true&characterEncoding=utf-8&useSSL=false"
  //驱动名称
//  val driver = "com.mysql.jdbc.Driver"
  val driver = "com.mysql.cj.jdbc.Driver"
  //用户名
  val username = "root"
  //密码
  val password = "123456"
  //初始化数据连接
  var connection: Connection = _
  try {
    //注册Driver
    Class.forName(driver)
    //得到连接
    connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement
    //执行查询语句，并返回结果
    val rs = statement.executeQuery("SELECT * FROM users limit 10 ")

    //打印返回结果
    while (rs.next) {
      val user_id = rs.getString("user_id")
      val name = rs.getString("name")
      //      println(name+"\t"+num)
      println("name = %s, num = %s".format(user_id, name))
    }

    println("查询数据完成！")


    //执行插入操作
    val rs2 = statement.executeUpdate("INSERT INTO `persons` (`name`, `num`) VALUES ('徐志摩', '22')")
    println("插入数据完成")
//
//
//    //    执行更新操作
//    val rs3 = statement.executeUpdate("UPDATE persons set num=55 WHERE `name`=\"徐志摩\"")
//    println("更新数据完成！")
//
//    //    执行删除操作
//
//    val rs4 = statement.executeUpdate("delete from persons WHERE `name`=\"徐志摩\"")
//    println("删除数据完成！")
//
//    //    执行调用存储过程操作
//    val rs5 = statement.executeUpdate("call add_student(3)")
//    println("调用存储过程完成！")


  } catch {
    case e: Exception => e.printStackTrace
  }
  //关闭连接，释放资源
  connection.close
}