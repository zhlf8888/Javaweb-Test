<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form name="lostpasswordform" id="lostpasswordform" action="http://www.233kb.com/?page_id=43" method="post">
		<p>
			<label for="user_login">用户名或电子邮件：</label>
			<input type="text" name="user_login" id="user_login" class="input" value="" size="20" />
		</p>

		
		<p class="submit">
			<input type="submit" name="wp-submit" id="wp-submit" value="Get New Password" />
			<input type="hidden" name="redirect_to" value="http://www.233kb.com/?page_id=40&amp;checkemail=confirm" />
			<input type="hidden" name="instance" value="" />
			<input type="hidden" name="action" value="lostpassword" />
		</p>
	</form>
  </body>
</html>
