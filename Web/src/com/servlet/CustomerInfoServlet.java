package com.servlet;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/customerInfoServlet")
public class CustomerInfoServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    this.doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    CustomerDao dao = new CustomerDaoImpl();
    String id = request.getParameter("id");
    Customer cust = dao.queryById(Integer.parseInt(id));
    request.setAttribute("cust", cust);
    request.getRequestDispatcher("/updateCustomer.jsp").forward(request, response);


  }
}
