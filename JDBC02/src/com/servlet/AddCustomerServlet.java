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
 * <p></p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/30
 */
@WebServlet("/addCustomerServlet")
public class AddCustomerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=UTF-8");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String birth = request.getParameter("birth");
    Customer customer = new Customer(name, email, JDBCUtils.changeToData(birth));
    CustomerDao dao = new CustomerDaoImpl();
    dao.add(customer);
    response.getWriter().write("添加成功");
    System.out.println("add success");
  }
}
