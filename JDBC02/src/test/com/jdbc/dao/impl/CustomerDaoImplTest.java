package test.com.jdbc.dao.impl;

import com.jdbc.bean.Customer;
import com.jdbc.dao.impl.CustomerDaoImpl;
import com.jdbc.utils.JDBCUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>CustomerDaoImpl Tester.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 04/29/2022
 */
public class CustomerDaoImplTest {

  /**
   * <p>前置条件：.</p>
   *
   * @throws Exception 异常
   */
  @Before
  public void before() throws Exception {
    System.out.println("before......");
  }

  /**
   * <p>后置条件：.</p>
   *
   * @throws Exception 异常
   */
  @After
  public void after() throws Exception {
    System.out.println("after......");
  }

  /**
   * <p>Method: add(Customer customer).</p>
   */
  @Test
  public void testAdd() throws Exception {
    // 创建Customer对象
    Customer customer =
        new Customer("张三", "zhangshan@qq.com", JDBCUtils.changeToData("1992-12-12"));
    // 创建CustomerDaoImpl对象
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    // 添加
    customerDao.add(customer);
    System.out.println("add success");
  }

  /**
   * <p>Method: update(Customer customer).</p>
   */
  @Test
  public void testUpdate() throws Exception {
    Customer customer = new Customer(3, "李四", "lisi@qq.com", JDBCUtils.changeToData("1992-12-12"));
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    customerDao.update(customer);
    System.out.println("update success");
  }

  /**
   * <p>Method: delete(int id).</p>
   */
  @Test
  public void testDelete() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    customerDao.delete(20);
    System.out.println("delete success");
  }

  /**
   * <p>Method: queryById(int id).</p>
   */
  @Test
  public void testQueryById() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    Customer customer = customerDao.queryById(1);
    System.out.println(customer);
  }

  /**
   * <p>Method: queryAll().</p>
   */
  @Test
  public void testQueryAll() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    for (Customer customer : customerDao.queryAll()) {
      System.out.println(customer);
    }
  }

  /**
   * <p>Method: getCount().</p>
   */
  @Test
  public void testGetCount() throws Exception {
    CustomerDaoImpl customerDao = new CustomerDaoImpl();
    System.out.println(customerDao.getCount());
  }
}
