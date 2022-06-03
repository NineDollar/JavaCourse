package com.servlet;

import com.dao.CustomerDao;
import com.dao.impl.CustomerDaoImpl;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/batchDeleteServlet")
public class BatchDeleteServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    this.doPost(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String[] ids = request.getParameterValues("delId");
    int[] numArr = new int[ids.length];
    for (int i = 0; i < ids.length; i++) {
      int n = Integer.parseInt(ids[i]);
      numArr[i] = n;
    }

    CustomerDao dao = new CustomerDaoImpl();
    dao.batchDel(numArr);
    request.getRequestDispatcher("/listCustomerServlet").forward(request, response);
  }
}
