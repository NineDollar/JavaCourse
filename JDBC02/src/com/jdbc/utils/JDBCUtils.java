package com.jdbc.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * <p>1.连接数据库工具</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/30
 */
public class JDBCUtils {

  private static String driver;
  private static String url;
  private static String username;
  private static String password;

  private static final Properties pro = new Properties();

  public JDBCUtils() {
  }

  static {
    try {
      // 类加载器
      InputStream in =
          JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
      pro.load(in);
      // 获取数据库参数文件对应的值
      driver = pro.getProperty("driver");
      url = pro.getProperty("url");
      username = pro.getProperty("username");
      password = pro.getProperty("password");
      Class.forName(driver);
    } catch (Exception e) {
      // e.printStackTrace();
      throw new ExceptionInInitializerError(e);
    }
  }

  /**
   * <p>获取数据库连接.</p>
   *
   * @return Connection
   */
  public static Connection getConnection() {
    try {
      // Class.forName(driver);
      return DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * <p>关闭连接.</p>
   *
   * @param conn 连接
   * @param stmt 执行SQL语句产生结果的对象
   * @param rs   检索下一个结果(下一个条数据)
   */
  public static void close(Connection conn, java.sql.Statement stmt, ResultSet rs) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (stmt != null) {
      try {
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * <p>字符串转为java.sql.Date.<p/>
   *
   * @param s 日期字符串,eg:2000-08-08
   * @return java.sql.Date
   */
  public static java.sql.Date changeToData(String s) {
    Date d = null;
    java.sql.Date birth = null;
    try {
      d = new SimpleDateFormat("yyyy-MM-dd").parse(s);
      birth = new java.sql.Date(d.getTime());
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return birth;
  }
}
