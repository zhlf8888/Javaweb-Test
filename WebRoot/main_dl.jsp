<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>删除一个联系人</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles2.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-switch.min.css">

    <link rel="stylesheet" type="text/css" href="js/bootstrap.min.js">
    <link rel="stylesheet" type="text/css" href="js/bootstrap-switch.min.js">

    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>

  </head>
  
  <body>
  
  	 <%
  		if(session.isNew()) {
  		response.sendRedirect("index.jsp");
  		}
  		
  	 %>
  
    <ul id="myTab" class="nav nav-tabs">
        <li role="presentation""><a href="db_show" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp查 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp看&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_edit.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp修&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp改&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_insert.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp新&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp建&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation class="active"><a href="main_delete.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp删&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp除&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_dl.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp关&nbsp&nbsp&nbsp&nbsp&nbsp于&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
 
   		<div class="searchinput">
     	    <form action="db_find" method="post">
    
         		<input type="text" name="name" class="tab_search" placeholder="搜 索 ...">

     	    </form>
 	    </div>
 
    </ul>
    <div class="randl">
         <h1>帮助与支持</h1>
         <h3>Download & About us</h3>
         <div class="dlb">
         	<a href="data.txt" target="_blank" class="home-button-1 uppercase  semibold">点击下载</a>
         	&nbsp&nbsp&nbsp&nbsp&nbsp
         	<a href="http://jq.qq.com/?_wv=1027&k=b99gD0" target="_blank" class="home-button-1 uppercase  semibold">共同学习</a>
		 </div>
    </div>
  </body>
</html>
