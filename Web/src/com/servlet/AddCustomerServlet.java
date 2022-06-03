package com.servlet;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import com.utils.JDBCUtils;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/addCustomerServlet")
public class AddCustomerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");

    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String birth1 = request.getParameter("birth");
    Date birth = JDBCUtils.changeToDate(birth1);
    Customer customer = new Customer(name, email, birth);
    CustomerDao dao = new CustomerDaoImpl();
    dao.add(customer);
    System.out.println("add success");
  }
}
