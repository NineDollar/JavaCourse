<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
      table {
        border: 1px solid #429fff;
        border-collapse: collapse;
      }

      table td {
        border: 1px solid #429fff;
        padding: 5px;
      }
    </style>
</head>
<body>
<h1>客户列表</h1>
<form action="${pageContext.request.contextPath}/batchDeleteServlet" method="post">
    <table border="1" width="500px">
        <tr>
            <th><input type="checkbox" onclick="checkAll(this)"/>全选</th>
            <th>姓名</th>
            <th>email</th>
            <th>日期</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach items="${custs}" var="cust">
            <tr>
                <th><input type="checkbox" name="delId" value="${cust.id}"/></th>
                <td><c:out value="${cust.name}"/></td>
                <td><c:out value="${cust.email}"/></td>
                <td><c:out value="${cust.birth}"/></td>
                <td><a href="${pageContext.request.contextPath}/customerInfoServlet?id=${cust.id}">修改</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteCustomerServlet?id=${cust.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="批量删除">
</form>
</body>
</html>
