package com.utils;


import java.util.logging.Logger;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * JDBCUtils Tester.
 *
 * @author NineDollar
 * @version 1.0
 * @since 05/17/2022
 */
public class JDBCUtilsTest {

  @Before
  public void before() throws Exception {
  }

  @After
  public void after() throws Exception {
  }

  /**
   * Method: getConnection()
   */
  @Test
  public void testGetConnection() throws Exception {
    System.out.println(JDBCUtils.getConnection());
  }

  /**
   * Method: getDataSource()
   */
  @Test
  public void testGetDataSource() throws Exception {

  }

  /**
   * Method: close(Connection conn, Statement st, ResultSet rs)
   */
  @Test
  public void testClose() throws Exception {

  }

  /**
   * Method: changeToDate(String s)
   */
  @Test
  public void testChangeToDate() throws Exception {

  }


} 
