package com.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.sql.DataSource;

/**
 * <p>数据库连接.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/17
 */
public class JDBCUtils {

  private JDBCUtils() {
  }

  private static DataSource ds = null;
  private static Properties pro = new Properties();

  static {
    try {
      InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
      pro.load(is);
      ds = DruidDataSourceFactory.createDataSource(pro);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Connection getConnection() {
    try {
      return ds.getConnection();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static DataSource getDataSource() {
    return ds;
  }

  public static void close(Connection conn, Statement st, ResultSet rs) {
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        rs = null;
      }
    }
    if (st != null) {
      try {
        st.close();
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        st = null;
      }
    }
    if (conn != null) {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      } finally {
        conn = null;
      }
    }
  }

  public static java.sql.Date changeToDate(String s) {
    java.util.Date d = null;
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
