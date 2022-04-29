package com.jdbc.dao;

import com.jdbc.bean.Customer;

import java.util.List;

/**
 * @ClassName CustomerDao
 * @Author NineDollar
 * @Date 2022/4/28 22:56
 * @Version 1.0
 * @Description 3
 */
public interface CustomerDao {
    void add(Customer customer);

    void update(Customer customer);

    void delete(int id);

    Customer queryById(int id);

    List<Customer> queryAll();

    long getCount();
}
