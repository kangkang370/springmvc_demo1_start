<%--
  Created by IntelliJ IDEA.
  User: 韩康
  Date: 2020/9/26
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>

	<%-- 常用注解 --%>
	<a href="anno/testRequestParam?name=xiaohan">RequestParam</a>

	</br>
	<form action = "anno/testRequestBody" method="post">
			用户姓名：<input type="text" name="username"/><br>
			用户年龄：<input type="text" name="age"/><br>
			<input type="submit" value="提交">
	</form>

	</br>
	<a href="anno/testRequestHeader/10">PathVariable</a>

	</br>
	<a href="anno/testRequestHeader">RequestHeader</a>

	</br>
	<a href="anno/testCookieValue">CookieValue</a>

	</br>

	<form action = "anno/testModelAttribute" method="post">
		用户姓名：<input type="text" name="uname"/><br>
		用户年龄：<input type="text" name="age"/><br>
		<input type="submit" value="提交">
	</form>

	<a href="anno/testSessionAttributes">testSessionAttributes</a>

	<a href="anno/getSessionAttributes">getSessionAttributes</a>

	<a href="anno/delSessionAttributes">delSessionAttributes</a>
</body>
</html>
