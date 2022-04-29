package com.jdbc.dao.impl;

import com.jdbc.bean.Customer;
import com.jdbc.dao.BaseDao;
import com.jdbc.dao.CustomerDao;

import java.util.List;

/**
 * 5
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022 /4/29
 */
public class CustomerDaoImpl extends BaseDao implements CustomerDao {

  @Override
  public void add(Customer customer) {
    String sql = "insert into customers(name,email,birth) values(?,?,?)";
    update(sql, customer.getName(), customer.getEmail(), customer.getBirth());
  }

  @Override
  public void update(Customer customer) {
    String sql = "update customers set name=?,email=?,birth=? where id=?";
    update(sql, customer.getName(), customer.getEmail(), customer.getBirth(), customer.getId());
  }

  @Override
  public void delete(int id) {
    String sql = "delete from customers where id=?";
    update(sql, id);
  }

  @Override
  public Customer queryById(int id) {
    String sql = "select id,name,email,birth from customers where id=?";
    return getInstance(Customer.class, sql, id);
  }

  @Override
  public List<Customer> queryAll() {
    String sql = "select id,name,email,birth from customers";
    return getAll(Customer.class, sql);
  }

  @Override
  public long getCount() {
    String sql = "select count(*) from customers";
    return getValue(sql);
  }
}
