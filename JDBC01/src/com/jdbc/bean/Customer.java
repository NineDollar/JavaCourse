package com.jdbc.bean;

import java.sql.Date;

/**
 * @ClassName Customer
 * @Author NineDollar
 * @Date 2022/4/28 22:35
 * @Version 1.0
 * @Description 2
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birth;

    public Customer(int id, String name, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    /**
     *
     * @param name 姓名
     * @param email 邮箱
     * @param birth 生日
     */
    public Customer(String name, String email, Date birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

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
