<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/19
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--fmt格式化--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>success</title>
</head>
<body>
success页面
<hr/>
fmt:
<%--<fmt:message  key="text.username"></fmt:message>--%>
<fmt:message key="i18n.username"></fmt:message>
<hr/>

<form action="/upload/fileupload" method="post" enctype="multipart/form-data">
    File:<input type="file" name="file1">
    <%--file1与UploadController.java中upload(@RequestParam("file1")相应--%>
    <input type="submit" value="上传">
</form>


<hr/>
<form action="/upload/fileupload2" method="post" enctype="multipart/form-data">
    File1:<input type="file" name="file">
    File2:<input type="file" name="file">
    <input type="submit" value="上传多文件">
</form>
</body>
</html>