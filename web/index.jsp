<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2019/4/18
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="/hello/say1" style="text-decoration: none;"><b>1、say1</b>|</a>
<a href="/hello/say2" style="text-decoration: none;"><b>say2</b>|</a>
<a href="/hello/say3" style="text-decoration: none;"><b>say3</b>|</a>
<a href="/hello/say4" style="text-decoration: none;"><b>say4</b></a><hr/>
<a href="/form.jsp" style="text-decoration: none;"><b>2、testMethod</b></a><hr/>
<a href="/form.jsp" style="text-decoration: none;"><b>3、testParamaAndHeaders</b></a><hr/>
<a href="/form.jsp" style="text-decoration: none;"><b>4、testHeaders</b></a><hr/>
<%--<a href="/ControllerMapping/testParamaAndHeaders?name=111&age=11">testParamaAndHeaders</a>--%>
<%--<a href="/ControllerMapping/testHeaders?name=111&age=11">testHeaders</a>--%>
<%--testAnt/abc??--%>
<a href="/ControllerMapping/testAnt/abcaa" style="text-decoration: none;"><b>5、abcaa</b>|</a>
<%--testAnt/*/abc--%>
<a href="/ControllerMapping/testAnt/aa/abc" style="text-decoration: none;"><b>aa/abc</b>|</a>
<%--testAnt/**/abc--%>
<a href="/ControllerMapping/testAnt/a/b/abc" style="text-decoration: none;"><b>a/b/abc</b>|</a>
<a href="/ControllerMapping/testAnt/a/b/c/abc" style="text-decoration: none;"><b>a/b/c/abc</b></a><hr/>
<%--delete/{id}--%>
<a href="/ControllerMapping/delete/2" style="text-decoration: none;"><b>6、delete/2</b></a><hr/>
<a href="/ParamController/param?age=11" style="text-decoration: none;"><b>7、param</b></a><hr/>
<a href="/ParamController/testRequestHeader" style="text-decoration: none;"><b>8、testRequestHeader</b></a><hr/>
<a href="/ParamController/addCookie"  style="text-decoration: none;"><b>9、addCookie</b>|</a>
<a href="/ParamController/getCookie"  style="text-decoration: none;"><b>getCookie</b></a><hr/>
<a href="/user.jsp"  style="text-decoration: none;"><b>10、testPojo</b></a><hr/>
<a href="/model/testSessionAttribute" style="text-decoration: none;"><b>11、testSessionAttribute</b></a><hr/>
<a href="/model/testModelAndView" style="text-decoration: none;"><b>12、testModelAndView</b></a><hr/>
<a href="/model/testModel" style="text-decoration: none;"><b>13、testModel</b></a><hr/>
<a href="/model/testMap" style="text-decoration: none;"><b>14、testMap</b></a><hr/>
<a href="/model/testModelMap" style="text-decoration: none;"><b>15、testModelMap</b></a><hr/>
<a href="/springmvc/testSessionAttribute" style="text-decoration: none;"><b>16、testSessionAttribute</b></a><hr/>
UserSession:${user}
</body>
</html>
