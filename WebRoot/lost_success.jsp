
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
<title>请检查您的电子邮件</title>

    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles2.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-switch.min.css">

    <link rel="stylesheet" type="text/css" href="js/bootstrap.min.js">
    <link rel="stylesheet" type="text/css" href="js/bootstrap-switch.min.js">
	<link rel="stylesheet" type="text/css" href="styles.css">
	<link rel="stylesheet" type="text/css" href="responsive.css">
</head>
<body>

<div class="ran">
	<div class="container">
		<h1>恭喜: <%=request.getAttribute("mailuser") %>！ 您的请求已通过！</h1>
		<h2>我们已发送一封确认邮件及一份数据备份至您位于 <%=request.getAttribute("mailabb") %> 的邮箱！</h2>
		<br><br>
		<h2>请及时查收并修改密码！</h2>
		<br><br><br><br><br><br><br><br>
		<form>
		<a class="home-button-2 uppercase  semibold" href="index.jsp"> 返  回 </a>
		</form>
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