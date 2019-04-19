<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/18
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--<form action="/ControllerMapping/testMethod" method="post">--%>
<form action="/ControllerMapping/testParamaAndHeaders" method="post">
<%--<form action="/ControllerMapping/testHeaders" method="post">--%>
    name: <input type="text" name="name" value=""><br/>
    age: <input type="text" name="age" value=""><br/>
    <input type="submit"  value="保存"><br/>
</form>
</body>
</html>

