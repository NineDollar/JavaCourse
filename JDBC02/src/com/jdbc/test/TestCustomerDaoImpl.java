package com.jdbc.test;

import com.jdbc.bean.Customer;
import com.jdbc.dao.impl.CustomerDaoImpl;
import com.jdbc.utils.JDBCUtils;
import org.junit.Test;

/**
 * <p></p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public class TestCustomerDaoImpl {

    @Test
    public void testAdd() {
        Customer customer = new Customer("李四", "lisi@qq.com", JDBCUtils.changeToData("1992-12-12"));
        CustomerDaoImpl customerDao = new CustomerDaoImpl();
        customerDao.add(customer);
    }
}
