<%--
  Created by IntelliJ IDEA.
  User: 小韩同学
  Date: 2020/9/26
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
    <%-- 请求参数的绑定 --%>

    <%--<a href="param/restParam?username=xiaohan&password=1234">请求参数的绑定</a>--%>
	<%-- 数据封装到Account类中 --%>
    <%--<form action = "param/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br>
        密码：<input type="text" name="password"/><br>
        金额：<input type="text" name="money"/><br>
        用户姓名：<input type="text" name="user.uname"/><br>
        用户年龄：<input type="text" name="user.age"/><br>
        <input type="submit" value="提交">
    </form>--%>

	<%-- 数据封装到Account类中，类中存在list和map的集合 --%><%--
    <form action = "param/saveAccount" method="post">
		姓名：<input type="text" name="username"/><br>
		密码：<input type="text" name="password"/><br>
		金额：<input type="text" name="money"/><br>

		用户姓名：<input type="text" name="list[0].uname"/><br>
		用户年龄：<input type="text" name="list[0].age"/><br>

		用户姓名：<input type="text" name="map['one'].uname"/><br>
		用户年龄：<input type="text" name="map['one'].age"/><br>
			<input type="submit" value="提交">
    </form>--%>

	<%-- 自定义类型转换器--%>
	<%--<form action = "param/saveUser" method="post">
		用户姓名：<input type="text" name="uname"/><br>
		用户年龄：<input type="text" name="age"/><br>
		用户生日：<input type="text" name="date"/><br>
		<input type="submit" value="提交">
	</form>--%>

	<%-- 获取Servlet的原生API --%>
	<a href="param/testServlet">Servlet的原生API</a>

</body>
</html>
