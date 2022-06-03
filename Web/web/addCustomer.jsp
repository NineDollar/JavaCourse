<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/addCustomerServlet" method="post">
         姓名:<input type="text" name="name"><br>
         邮件:<input type="text" name="email"><br>
         出生日期:<input type="date" name="birth"><br>
          <input type="submit" value="添加"><br>
     </form>
</body>
</html>
