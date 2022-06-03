package com.servlet;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import com.utils.JDBCUtils;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/updateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {

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

    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String birth1 = request.getParameter("birth");
    Date birth = JDBCUtils.changeToDate(birth1);

    Customer customer = new Customer(Integer.parseInt(id), name, email, birth);

    CustomerDao dao = new CustomerDaoImpl();
    dao.update(customer);
    request.getRequestDispatcher("/listCustomerServlet").forward(request, response);
  }
}
