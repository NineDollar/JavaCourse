package com.jdbc.dao.impl;

import com.jdbc.bean.Customer;
import com.jdbc.dao.CustomerDao;
import com.jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CustomerDaoImpl
 * @Author NineDollar
 * @Date 2022/4/28 22:44
 * @Version 1.0
 * @Description 4
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void add(Customer customer) {
        String sql = "insert into customers(name,email,birth) values(?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setDate(3, customer.getBirth());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, null);
        }
    }

    @Override
    public void update(Customer customer) {
        String sql = "update customers set name=?,email=?,birth=? where id=?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getEmail());
            ps.setDate(3, customer.getBirth());
            ps.setInt(4, customer.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, null);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from customers where id=?";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, null);
        }
    }

    @Override
    public Customer queryById(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from customers where id=?";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Customer customer = null;
            if (rs.next()) {
                customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString(
                        "email"), rs.getDate("birth"));
            }
            return customer;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(conn, ps, rs);
        }
        return null;
    }

    @Override
    public List<Customer> queryAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from customers";
        List<Customer> list = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt("id"), rs.getString("name"),
                        rs.getString(
                                "email"), rs.getDate("birth"));
                list.add(customer);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public long getCount() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select count(*) from customers";
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
