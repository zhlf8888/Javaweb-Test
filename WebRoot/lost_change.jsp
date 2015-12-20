
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
<title>找回密码</title>

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
		<h1>欢迎归来：<%=request.getParameter("name")%></h1>
		<h2>请为你的账号设置一个新的密码</h2>
		
		<form class="form" action="db_changepwd" method="post">
			<input type="hidden" name="name" value=<%=request.getParameter("name")%>>
			<input type="hidden" name="old" value=<%=request.getParameter("password")%>>
			<input type="password" name="userPwd" placeholder="新 密 码">
			<input type="password" name="userPwd2" placeholder="确认密码">
			<button type="submit">提&nbsp&nbsp&nbsp&nbsp&nbsp交</button>
			<br><br>
			<font color="white">${requestScope.error }</font>
			<br><br><br><br><br>
		    <a class="home-button-2 uppercase  semibold" href="index.jsp"> 返  回 </a>
		</form>
<!-- 		
		<form class="form" name="lostpasswordform" id="lostpasswordform" action="http://www.233kb.com/?page_id=43" method="post">
			<input type="text" name="user_login" id="user_login" class="input" value="" size="20" placeholder="用户名 / E-Mail" />
			<input type="submit" name="wp-submit" id="wp-submit"/>
			<input type="hidden" name="redirect_to" value="http://www.233kb.com/?page_id=40&amp;checkemail=confirm" />
			<input type="hidden" name="instance" value="" />
			<input type="hidden" name="action" value="lostpassword" />
			<br><br><br><br><br>
		    <a class="home-button-2 uppercase  semibold" href="index.jsp"> 返  回 </a>
		</form>
-->
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