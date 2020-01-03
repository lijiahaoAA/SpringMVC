<%--
  Created by IntelliJ IDEA.
  User: 13018
  Date: 2020/1/2
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用注解</title>
</head>
<br>
    <%--常用的注解--%>
    <%--RequestParam 注解--%>
    <a href="anno/testRequestParam?name=李家豪" >RequestParam注解测试</a><br/><br/>

    <%--RequestBody 注解--%>
    <form action="anno/testRequestBody" method="post">
        RequestBody注解测试用户姓名：<input type="text" name="username"/><br/>
        RequestBody注解测试用户年龄：<input type="text" name="age"/><br/>
        <input type="submit" value="提交"/><br/>
    </form><br/><br/>

    <%--PathVariable 注解--%>
    <a href="anno/testPathVariable/10" >PathVariable注解测试(传过sid=10)</a><br/><br/>

    <%--RequestHeader 注解--%>
    <a href="anno/testRequestHeader" >RequestHeader注解测试</a><br/><br/>

    <%--CookieValue 注解--%>
    <a href="anno/testCookieValue" >CookieValue注解测试</a><br/><br/>

    <%--ModelAttribute 注解--%>
    <form action="anno/testModelAttribute" method="post">
        <%--user实体类有三个属性，这里提交两个属性，则date属性仍旧使用原来数据库中的数据，uname，uage会更新--%>
        ModelAttribute注解测试用户姓名：<input type="text" name="uname"/><br/>
        ModelAttribute注解测试用户年龄：<input type="text" name="uage"/><br/>
        <input type="submit" value="提交"/><br/>
    </form><br/><br/>

    <%--SessionAttributes 注解--%>
    <a href="anno/testSessionAttributes" >SessionAttributes注解测试session域存值</a><br/><br/>
    <a href="anno/getSessionAttributes" >SessionAttributes注解测试session域取值</a><br/><br/>
<a href="anno/delSessionAttributes" >SessionAttributes注解测试session域删除值</a><br/><br/>
</body>
</html>
