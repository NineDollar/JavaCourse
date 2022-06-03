package com.servlet;

import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String id = request.getParameter("id");
    CustomerDao dao = new CustomerDaoImpl();
    dao.delete(Integer.parseInt(id));
    request.getRequestDispatcher("/listCustomerServlet").forward(request, response);
  }
}
