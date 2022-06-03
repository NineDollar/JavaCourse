package com.servlet;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/listCustomerServlet")
public class ListCustomerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    //response.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    CustomerDao dao = new CustomerDaoImpl();
    List<Customer> cs = dao.queryAll();
    request.setAttribute("custs", cs);
    request.getRequestDispatcher("/listcustomer.jsp").forward(request, response);


  }
}
