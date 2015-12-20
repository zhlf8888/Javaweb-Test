<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改一个联系人</title>
    
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
        <li role="presentation class="active"><a href="main_edit.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp修&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp改&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
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
         <h1>编  辑</h1>
         <h3>Something with wrong ?</h3>
    </div>
    <form action = "db_edit" method = "post">
    <center>
    	<table border = "0" width = "238" height = "252">

    		<tr>
                <td> 
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">姓名</span>
                        <input type="text" name="name" class="form-control" placeholder="在此输入" aria-describedby="sizing-addon1">      
                    </div>
                    <div class="blank">
                    </div>
                </td>
            </tr>

            <tr>
                <td>
                    <div class="radio">
                        <label>
                             <input type="radio" name="sex" id="optionsRadios1" value="男" checked>男
                        </label>
                        &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                        <label>
                             <input type="radio" name="sex" id="optionsRadios2" value="女">女
                        </label>
                    </div>
                    <div class="blank">
                    </div>
                </td>
            </tr>

    		<tr>
                <td> 
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">关系</span>
                        <input type="text" name="relation" class="form-control" placeholder="在此输入" aria-describedby="sizing-addon1">
                    </div>
                    <div class="blank">
                    </div>
                </td>
            </tr>

    		<tr>
                <td> 
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">电话</span>
                        <input type="text" name="mobile" class="form-control" placeholder="在此输入" aria-describedby="sizing-addon1">
                        <br><br>
                    </div>
                    <div class="blank">
                    </div>
                </td>
            </tr>

    		<tr>
                <td> 
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon" id="sizing-addon1">微信</span>
                        <input type="text" name="wechat" class="form-control" placeholder="在此输入" aria-describedby="sizing-addon1">
                    </div>
                    <div class="blank">
                    </div>
                </td>
            </tr>

    		<tr align = "center">
    			<td colspan = "2">
    				<input class="btn btn-primary btn-lg" type = "submit" value = "提交">
    				<input class="btn btn-primary btn-lg" type = "reset" value = "重置"><br><br>
    				<font color="blue">${requestScope.error }</font>
    			</td>
    		</tr>
    	</table>
    </center>
    </form>
  </body>
</html>
