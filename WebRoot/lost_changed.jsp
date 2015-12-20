<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="refresh" content="4;url=index.jsp">
<title>欢迎加入</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<link rel="stylesheet" type="text/css" href="responsive.css">
</head>
<body>

<div class="ran">
	<div class="container">

		<h1>您已成功为 <%=request.getParameter("name") %> 修改了密码 ！</h1>

		<h3>正在为你跳转...</h3>
		
	</div>
	<ul class="bg-animation">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
</div>

</body>
</html>