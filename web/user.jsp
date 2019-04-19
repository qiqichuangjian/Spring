<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/18
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="ParamController/testPojo" method="post">
    username:<input type="text" value="" name="username"><br/>
    password:<input type="password" value="" name="password"><br/>
    email:<input type="email" value="" name="email">
    <br/>
    age:<input type="number" value="" name="age">
    <br/>
    province:<input type="text" value="" name="address.province">
    <br/>
    city:<input type="text" value="" name="address.city">
    <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>

