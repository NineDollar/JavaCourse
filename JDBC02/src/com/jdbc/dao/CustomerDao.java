package com.jdbc.dao;

import com.jdbc.bean.Customer;

import java.util.List;

/**
 * <p>4</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public interface CustomerDao {
    void add(Customer customer);

    void update(Customer customer);

    void delete(int id);

    Customer queryById(int id);

    List<Customer> queryAll();

    long getCount();
}
