<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateCustomerServlet" method="post">
    <input type="hidden" name="id" value="${cust.id}">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${cust.name}"></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email" value="${cust.email}"></td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td><input type="date" name="birth" value="${cust.birth}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改客户"></td>
        </tr>
    </table>
</form>
</body>
</html>
