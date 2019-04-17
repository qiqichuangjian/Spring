<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/17
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>query</title>
</head>
<body>
<table>
    <tr>
        <td>ID</td>
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    <c:forEach var="user" items="${lists}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>
                <a href="/user/delete/${user.id}" >删除</a>
                <a href="/user/update/${user.id}" >修改</a>
            </td>
        </tr>
    </c:forEach>
    <a href="/user/toadd">add</a>
</table>
</body>
</html>
