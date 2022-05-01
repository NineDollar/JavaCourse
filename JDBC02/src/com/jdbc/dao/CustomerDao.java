package com.jdbc.dao;

import com.jdbc.bean.Customer;

import java.util.List;

/**
 * <p>4.数据库基本操作接口</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public interface CustomerDao {

  /**
   * <p>添加客户.</p>
   *
   * @param customer 客户对象
   */
  void add(Customer customer);

  /**
   * <p>更新客户.</p>
   *
   * @param customer 客户对象
   */
  void update(Customer customer);

  /**
   * <p>删除客户.</p>
   *
   * @param id 客户id
   */
  void delete(int id);

  /**
   * <p>根据id查询客户.</p>
   *
   * @param id 客户id
   * @return
   */
  Customer queryById(int id);

  /**
   * <p>查询所有客户.</p>
   *
   * @return 客户列表
   */
  List<Customer> queryAll();

  /**
   * <p>根据名称查询客户.</p>
   *
   * @return 客户列表
   */
  long getCount();
}
