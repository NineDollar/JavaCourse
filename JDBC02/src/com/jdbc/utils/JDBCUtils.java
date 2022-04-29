package com.jdbc.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * <p>1</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    private static final Properties pro = new Properties();

    static {
        try {
            InputStream in =
                    ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
            pro.load(in);
            driver = pro.getProperty("driver");
            url = pro.getProperty("url");
            username = pro.getProperty("username");
            password = pro.getProperty("password");
            Class.forName(driver);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, java.sql.Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static java.sql.Date changeToData(String s) {
        Date d = null;
        java.sql.Date birth = null;
        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(s);
            birth = new java.sql.Date(d.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return birth;
    }
}
