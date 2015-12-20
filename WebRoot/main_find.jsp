<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.bistu.javaweb.dao.DataDAO,com.bistu.javaweb.daoImpl.DataDAOImpl,com.bistu.javaweb.domain.Data,java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>查找一个联系人</title>
    
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
        <li role="presentation" class="active"><a href="db_show" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp查 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp看&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_edit.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp修&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp改&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_insert.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp新&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp建&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_delete.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp删&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp除&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
        <li role="presentation"><a href="main_dl.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp关&nbsp&nbsp&nbsp&nbsp&nbsp于&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
   
  		<div class="searchinput">
     	    <form action="db_find" method="post">
    
         		<input type="text" name="name" class="tab_search" placeholder="搜 索 ...">

     	    </form>
 	    </div>   
   
    </ul>
    <div class="ran0">
         <h1>搜索与查找</h1>
         <h3>Find a contact information</h3>
    </div>
  	
  	  	<table class="table table-striped" >
  
  	<tr class="table" align="center" height="25">
  		<td>姓名</td>
  		<td>性别</td>
  		<td>关系</td>
  		<td>电话</td>
  		<td>微信</td>
  	</tr>

		<% 
		Data d = (Data)request.getAttribute("rs");
		if(d!=null){
		%>
		
	<tr class = "table1" align = "center" height = "25">
		<td><%=d.getName() %></td>
		<td><%=d.getSex() %></td>
		<td><%=d.getRelation() %></td>
		<td><%=d.getMobile() %></td>
		<td><%=d.getWechat() %></td>
	</tr>
	
	<%} %>
		
		
    
    </table>
    <br>
  <center>
    <font color="blue">${requestScope.error }</font>
  </center>	
  </body>
</html>
