<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/17
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<form action="/user/save">
    <table>
        <tr>
            <td>username</td>
            <td><input type="text" name="username"  value=""></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="text" name="password"  value=""></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="addButton">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
