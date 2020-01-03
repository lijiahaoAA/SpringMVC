<%--
  Created by IntelliJ IDEA.
  User: 13018
  Date: 2019/12/28
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
    <h3>入门程序</h3>
    <p><a href="user/hello">入门</a><%--//user前不能带有/，引用下级目录--%></p>
    <p><a href="user/testRequestMapping?username=heihei">RequestMapping注解</a></p>
    <p><a href="param.jsp">参数绑定实例</a></p>
    <p><a href="anno.jsp">常用注解测试</a></p>
    <%-- ?username=heihei是为了传入param的属性参数，param的username要求为heihei，则必须传入的参数为heihei --%>
</body>
</html>
