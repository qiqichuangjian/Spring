<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/19
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<c:if test="${empty requestScope.employees}">
员工表
</c:if>
<c:if test="${!empty requestScope.employees }">
<table border="1" cellpadding="10" cellspacing="0">
<tr>
    <th>id</th>
    <th>lastName</th>
    <th>email</th>
    <th>gender</th>
    <th>department</th>
    <th>edit</th>
    <th>delete</th>
</tr>
<c:forEach items = "${requestScope.employees }" var="emp">
<tr>
    <td>${emp.id }</td>
    <td>${emp.lastName }</td>
    <td>${emp.email }</td>
    <td>${emp.id == 0 ? 'gender':'male' }</td>
    <td>${emp.department.departmentName }</td>
    <td><a href ="">Edit</a></td>
    <td><a href ="">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:if>
</body>

</html>
