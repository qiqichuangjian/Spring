<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/17
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
   <a href="/hello">hello</a> <hr/>
   <a href="/helloworld">hello1</a> <hr/>
   <a href="/model/query">model</a> <hr/>
   <a href="/model/testParamaAndHeaders1?username=111&age=11">网址栏填参数信息的</a> <hr/>
   <a href="/model/testParamaAndHeaders2?username=111&age=11">网址栏填参数信息的,在控制台打印信息1</a> <hr/>
   <a href="/model/testParamaAndHeaders3?username=111&age=11">网址栏填参数信息的,在控制台打印信息2</a> <hr/>
   <a href="/model/testParama?username=111">验证，不需要填属性信息</a> <hr/>
   <a href="/model/testAnt/abc">模糊查询1</a> <hr/>
   <a href="/model/testAnt/aa/abc">模糊查询2</a> <hr/>
   <a href="/model/testAnt/aa/bb/abc">模糊查询3</a> <hr/>
   <a href="/model/test/abc">超模糊查询1</a> <hr/>
   <a href="/model/test/abd">超模糊查询2</a> <hr/>
   <a href="/china/query/1">id查询1</a> <hr/>
   <%--<a href="/china/query/2">id查询2</a> <hr/>--%>
   <a href="/list/add">add</a> <hr/>
</body>
</html>
