<%--
  Created by IntelliJ IDEA.
  User: NineDollar
  Date: 2022/4/29
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addCustomerServlet" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td><input type="date" name="birth"/></td>
        </tr>
        <tr>
            <td>提交</td>
            <td><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form>
</body>
</html>
