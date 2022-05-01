package com.servlet;

import com.jdbc.bean.Customer;
import com.jdbc.dao.CustomerDao;
import com.jdbc.dao.impl.CustomerDaoImpl;
import com.jdbc.utils.JDBCUtils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>6.网页请求会进到这里来.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/30
 */
// Servlet注解,省略了urlPatterns属性名,表示该Servlet默认的请求路径为…/addCustomerServlet
@WebServlet("/addCustomerServlet")
public class AddCustomerServlet extends HttpServlet {

  /**
   * <p>get请求会进入到该方法.</p>
   *
   * @param request  请求体
   * @param response 响应体
   * @throws ServletException ServletException
   * @throws IOException      I/O 异常
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  /**
   * <p>post请求会进入到该方法.</p>
   *
   * @param request  请求体
   * @param response 响应体
   * @throws ServletException ServletException
   * @throws IOException      I/O 异常
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 防止中文乱码
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=UTF-8");
    // 获取请求参数
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String birth = request.getParameter("birth");
    // 封装成对象
    Customer customer = new Customer(name, email, JDBCUtils.changeToData(birth));
    // 调用dao层
    CustomerDao dao = new CustomerDaoImpl();
    // 添加
    dao.add(customer);
    // 跳转到查询页面
    response.getWriter().write("添加成功");
    // 输出到tomcat日志
    System.out.println("add success");
  }
}
