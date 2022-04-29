package com.jdbc.test;

import com.jdbc.bean.Customer;
import com.jdbc.dao.CustomerDao;
import com.jdbc.dao.impl.CustomerDaoImpl;
import com.jdbc.utils.JDBCUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @ClassName TestCustomerDaoImpl
 * @Author NineDollar
 * @Date 2022/4/28 17:25
 * @Version 1.0
 * @Description TODO
 */
public class TestCustomerDaoImpl {
    private CustomerDao dao;

    @Before
    public void setUp() {
        dao = new CustomerDaoImpl();
        System.out.println("setUp......");
    }

    @After
    public void setDown() {
        dao = null;
        System.out.println("setDown......");
    }

    @Test
    public void testAdd() {
        Customer customer = new Customer("张三", "zhangsan@qq.com", JDBCUtils.changeToData("1992-01"
                + "-01"));
        dao.add(customer);
        System.out.println("add success");
    }

    @Test
    public void testUpdate() {
        Customer customer = new Customer("李四", "lisi@qq.com", JDBCUtils.changeToData("1999-01-01"));
        customer.setId(2);
        dao.update(customer);
        System.out.println("update success");
    }

    @Test
    public void testDelete() {
        dao.delete(2);
        System.out.println("delete success");
    }

    @Test
    public void testQueryById() {
        Customer customer = dao.queryById(1);
        System.out.println(customer);
    }

    @Test
    public void testQueryAll() {
        for (Customer customer : dao.queryAll()) {
            System.out.println(customer);
        }
    }

    @Test
    public void testGetCount() {
        System.out.println(dao.getCount());
    }
}
