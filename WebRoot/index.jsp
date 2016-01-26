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
		<h1>欢 迎 使 用</h1>
		<h4>需要验证你的身份</h4>
		<form class="form" action="db_verify" method="post">
			<input type="text" name="userName" placeholder="用  户  名">
			<input type="password" name="userPwd" placeholder="密       码">
			<button type="submit">登&nbsp&nbsp&nbsp&nbsp&nbsp录</button><br><br>
			<div class="tip">
				<font color="white">${requestScope.error }</font>
			</div>
			<br><br><br><br><br><br><br>
			
		    <a class="home-button-2 uppercase  semibold" href="register.jsp"> 马上注册 </a>
		    &nbsp&nbsp&nbsp
		    <a href="http://wpa.qq.com/msgrd?v=3&uin=904154180&site=qq&menu=yes" target="_blank" class="home-button-2 uppercase  semibold"> 联系作者 </a>
		    &nbsp&nbsp&nbsp
		    <a class="home-button-2 uppercase  semibold" href="lost.jsp"> 忘记密码</a>
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