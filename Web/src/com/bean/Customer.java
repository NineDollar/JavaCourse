package com.bean;

import java.sql.Date;

/**
 * <p>2.表对象.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public class Customer {

  /**
   * <p>映射数据库所有字段.</p>
   */
  private int id;
  private String name;
  private String email;
  private Date birth;

  // 默认构造函数,反射可能会用上
  public Customer() {
  }

  /**
   * <p>没有id的构造函数,主键默认值.</p>
   *
   * @param name  姓名
   * @param email 邮箱
   * @param birth 生日
   */
  public Customer(String name, String email, Date birth) {
    this.name = name;
    this.email = email;
    this.birth = birth;
  }

  public Customer(int id, String name, String email, Date birth) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.birth = birth;
  }

  /**
   * <p>以下函数利用idea自动生成,或者使用lombok添加注解方式.</p>
   *
   * @return int
   */
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", birth=" + birth +
        '}';
  }
}
