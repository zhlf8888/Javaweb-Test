<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.bistu.javaweb.dao.DataDAO,com.bistu.javaweb.daoImpl.DataDAOImpl,com.bistu.javaweb.domain.Data,java.sql.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <title></title>
    <style>
        h4{
            margin: 40px 0 10px;
        }
        .nav-tabs{
            margin-bottom: 15px;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <link rel="stylesheet" type="text/css" href="js/bootstrap.min.js">
    <link rel="stylesheet" type="text/css" href="js/bootstrap.min.js">
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
            <li role="presentation" class="active"><a href="db_show" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp查 &nbsp&nbsp&nbsp&nbsp&nbsp看&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
            <li role="presentation"><a href="main_edit.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp修&nbsp&nbsp&nbsp&nbsp&nbsp改&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
            <li role="presentation"><a href="main_insert.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp新&nbsp&nbsp&nbsp&nbsp&nbsp建&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
            <li role="presentation"><a href="main_delete.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp删&nbsp&nbsp&nbsp&nbsp&nbsp除&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
            <li role="presentation"><a href="main_dl.jsp" data-toggle="tab">&nbsp&nbsp&nbsp&nbsp&nbsp关&nbsp&nbsp&nbsp&nbsp&nbsp于&nbsp&nbsp&nbsp&nbsp&nbsp</a></li>
    </ul>
    <div id="myTabcontent" class="tab-content">
        <div class="tab-pane fade in active" id="home">

          <div class="ran0">
                  <h1>检  视</h1>
                  <h3>View your contact</h3>
          </div>

            <table class="table table-striped" >
  
                <tr class="table" align="center" height="25">
                    <td><h3><strong>姓  名</strong></h3></td>
                    <td><h3><strong>性  别</strong></h3></td>
                    <td><h3><strong>关  系</strong></h3></td>
                    <td><h3><strong>电  话</strong></h3></td>
                    <td><h3><strong>微  信</strong></h3></td>
                </tr>

                <% 
                List list = (List)request.getAttribute("list");
                if(list!=null){
                    for(int i = 0; i < list.size(); i++) {
                    Data d = (Data)list.get(i);
                %>
        
                <tr class = "table1" align = "center" height = "25">
                    <td><%=d.getName() %></td>
                    <td><%=d.getSex() %></td>
                    <td><%=d.getRelation() %></td>
                    <td><%=d.getMobile() %></td>
                    <td><%=d.getWechat() %></td>
                </tr>
    
                <%}} %>

            </table>

        </div>

<!-- JiaThis Button BEGIN -->
<script type="text/javascript" >
var jiathis_config={
	siteNum:5,
	sm:"copy,fav,weixin,qzone,tsina",
	url:"www.233kb.com",
	summary:"听说Javaweb要结课啦！",
	title:"听说Javaweb要结课啦！ ##你懂得##",
	showClose:true,
	shortUrl:false,
	hideMore:false
}
</script>
<script type="text/javascript" src="http://v3.jiathis.com/code_mini/jiathis_r.js?btn=r3.gif&move=0" charset="utf-8"></script>
<!-- JiaThis Button END -->


</body>
</html>