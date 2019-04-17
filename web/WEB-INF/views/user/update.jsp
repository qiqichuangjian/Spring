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
    <title>update</title>
</head>
<body>
<form action="/user/updateUser">
    <table>
        <%--代表user.id!=null时id才显示--%>
        <%--之前add.jsp与update.jsp写在一起，所以判断id显示不显示--%>
        <%--<c:if test="${user.id!=null}">--%>
            <%--<tr>--%>
                <%--<td>id</td>--%>
                <%--<td><input type="text" name="id" readonly="readonly" value="${user.id}"></td>--%>
            <%--</tr>--%>
        <%--</c:if>--%>
        <tr>
            <td>id</td>
            <td><input type="text" name="id" readonly="readonly" value="${user.id}"></td>
        </tr>
        <tr>
            <td>username</td>
            <td><input type="text" name="username"  value="${user.username}"></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="text" name="password"  value="${user.password}"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="updateButton">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
