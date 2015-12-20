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
<title>欢迎使用</title>

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
		<h1>离成功还差一步！</h1>
		<form class="form" action="db_register" method="post">
			<input type="text" name="userName" placeholder="用  户  名">
			<input type="password" name="userPwd" placeholder="密       码">
			<input type="password" name="userPwd2" placeholder="确认密码">
			<input type="text" name="userMail" placeholder="E-Mail">
			<button type="submit">马&nbsp&nbsp上&nbsp&nbsp注&nbsp&nbsp册</button><br><br>
			<font color="white">${requestScope.error }</font>
			<br>
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