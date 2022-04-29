package test.com.jdbc.dao.impl;

import com.jdbc.bean.Customer;
import com.jdbc.dao.impl.CustomerDaoImpl;
import com.jdbc.utils.JDBCUtils;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * CustomerDaoImpl Tester.
 *
 * @author NineDollar
 * @since 04/29/2022
 * @version 1.0
 */
public class CustomerDaoImplTest {

  @Before
  public void before() throws Exception {
    System.out.println("before......");
  }

  @After
  public void after() throws Exception {
    System.out.println("after......");
  }

  /** Method: add(Customer customer) */
  @Test
  public void testAdd() throws Exception {
    Customer customer =
        new Customer("张三", "zhangshan@qq.com", JDBCUtils.changeToData("1992-12-12"));
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    customerDao.add(customer);
    System.out.println("add success");
  }

  /** Method: update(Customer customer) */
  @Test
  public void testUpdate() throws Exception {
    Customer customer = new Customer(3, "李四", "lisi@qq.com", JDBCUtils.changeToData("1992-12-12"));
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    customerDao.update(customer);
    System.out.println("update success");
  }

  /** Method: delete(int id) */
  @Test
  public void testDelete() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    customerDao.delete(20);
    System.out.println("delete success");
  }

  /** Method: queryById(int id) */
  @Test
  public void testQueryById() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    Customer customer = customerDao.queryById(1);
    System.out.println(customer);
  }

  /** Method: queryAll() */
  @Test
  public void testQueryAll() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    for (Customer customer : customerDao.queryAll()) {
      System.out.println(customer);
    }
  }

  /** Method: getCount() */
  @Test
  public void testGetCount() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    System.out.println(customerDao.getCount());
  }
}
