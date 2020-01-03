<%--
  Created by IntelliJ IDEA.
  User: 13018
  Date: 2020/1/2
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
    <%-- 请求参数绑定到某个方法，参数名称=方法参数名称--%>
    <a href="param/testParam?username=lijiahao&password=123456">请求参数绑定</a>

    <%--
    把数据封装在Account类中，类中存在User引用类型
    &lt;%&ndash;请求参数绑定—表单提交到实例化的javabean，name==javabean中属性名称&ndash;%&gt;
    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="text" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        &lt;%&ndash; user为 Account的属性，uname，uage为User的属性，调用方法如下&ndash;%&gt;
        用户姓名：<input type="text" name="user.uname"/><br/>
        用户年龄：<input type="text" name="user.uage"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>--%>

    <%-- 把数据封装在Account类中，类中存在List和map集合 --%>
    <%--<form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="text" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        &lt;%&ndash; 将这两个数据使用User封装并存在list中&ndash;%&gt;
        用户姓名：<input type="text" name="list[0].uname"/><br/>
        用户年龄：<input type="text" name="list[0].uage"/><br/>
        &lt;%&ndash; 将这两个数据使用User封装并存在map中，['key名称（随意起）']&ndash;%&gt;
        用户姓名：<input type="text" name="map['one'].uname"/><br/>
        用户年龄：<input type="text" name="map['one'].uage"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>--%>

    <%-- 自定义类型转换器--%>
    <%-- <form action="param/saveUser" method="post">
        用户姓名：<input type="text" name="uname"/><br/>
        用户年龄：<input type="text" name="uage"/><br/>
        用户生日：<input type="text" name="date"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>--%>

    <a href="param/testServlet">测试原生Servlet API</a>
</body>
</html>
