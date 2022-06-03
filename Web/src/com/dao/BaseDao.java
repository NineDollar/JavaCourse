package com.dao;

import com.utils.JDBCUtils;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>3.通用数据库操作模板.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public abstract class BaseDao {

  /**
   * <p>对表更新操作</p>
   * eg: 1.增加 2.删除 3.修改
   *
   * @param sql  SQL语句
   * @param args 多个参数
   */
  public void update(String sql, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    try {
      // 通过工具类获取连接
      conn = JDBCUtils.getConnection();
      // 大概是格式化sql语句
      ps = conn.prepareStatement(sql);
      // 给SQL语句占位符填充值
      for (int i = 0; i < args.length; i++) {
        ps.setObject(i + 1, args[i]);
      }
      // 执行SQL语句
      ps.executeUpdate();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      // 关闭连接
      JDBCUtils.close(conn, ps, null);
    }
  }

  /**
   * <p>获取一条数据,前提是我们不知道是什么类型,</p>
   * <p>通过传入类型创建对象,增加了代码通用性,减小代码冗余.</p>
   * <p>利用反射实现.</p>
   *
   * @param clazz 传入类型
   * @param sql   SQL语句
   * @param args  多个参数
   * @param <T>   类型
   * @return 类型对象
   */
  public <T> T getInstance(Class<T> clazz, String sql, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      conn = JDBCUtils.getConnection();
      ps = conn.prepareStatement(sql);
      for (int i = 0; i < args.length; i++) {
        ps.setObject(i + 1, args[i]);
      }
      rs = ps.executeQuery();
      // 检索此返回对象的列的数量、类型和属性
      ResultSetMetaData metaData = rs.getMetaData();
      // 获取列数
      int columnCount = metaData.getColumnCount();
      if (rs.next()) {
        // 大概是利用反射创建对象
        T t = clazz.getDeclaredConstructor().newInstance();
        for (int i = 0; i < columnCount; i++) {
          // 获取列值
          Object columnValue = rs.getObject(i + 1);
          // 获取列对应的列名
          String columnName = metaData.getColumnName(i + 1);
          // 给t对象指定的columnName属性对应的columnValue值，通过反射实现
          Field field = clazz.getDeclaredField(columnName);
          field.setAccessible(true);
          field.set(t, columnValue);
        }
        return t;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      JDBCUtils.close(conn, ps, rs);
    }
    return null;
  }

  /**
   * <p>获取所有用户.</p>
   *
   * @param clazz 传入类型
   * @param sql   SQL语句
   * @param args  多个参数
   * @param <T>   类型
   * @return 类型对象集合
   */
  public <T> List<T> getAll(Class<T> clazz, String sql, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      conn = JDBCUtils.getConnection();
      ps = conn.prepareStatement(sql);
      for (int i = 0; i < args.length; i++) {
        ps.setObject(i + 1, args[i]);
      }
      rs = ps.executeQuery();
      ResultSetMetaData metaData = rs.getMetaData();
      int columnCount = metaData.getColumnCount();
      List<T> list = new ArrayList<>();
      while (rs.next()) {
        T t = clazz.getDeclaredConstructor().newInstance();
        for (int i = 0; i < columnCount; i++) {
          Object columnValue = rs.getObject(i + 1);
          String columnName = metaData.getColumnName(i + 1);
          Field field = clazz.getDeclaredField(columnName);
          field.setAccessible(true);
          field.set(t, columnValue);
        }
        list.add(t);
      }
      return list;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      JDBCUtils.close(conn, ps, rs);
    }
    return null;
  }

  /**
   * <p>获取一条数据.</p>
   *
   * @param sql  SQL语句
   * @param args 多个参数
   * @param <E>  类型
   * @return 类型对象
   */
  public <E> E getValue(String sql, Object... args) {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
      conn = JDBCUtils.getConnection();
      ps = conn.prepareStatement(sql);
      for (int i = 0; i < args.length; i++) {
        ps.setObject(i + 1, args[i]);
      }
      rs = ps.executeQuery();
      if (rs.next()) {
        return (E) rs.getObject(1);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      JDBCUtils.close(conn, ps, rs);
    }
    return null;
  }
}
