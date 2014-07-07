<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>404 page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is 404 page">
	<style type="text/css">
	body {
	background: #000000 url('imgs/estrellas.png') center;
	color: #ffffff;
	font-family: "Helvetica Neue",Arial,Helvetica,sans-serif;
	margin: 0px;
	text-align: center;
	}
	h1 {
font-size: 48px;
font-weight: normal;
padding: 0px 20px 5px;
border-bottom: 2px solid #222222;
display: inline-block;
margin: 0px 0px 15px 0px;
}
h2 {
font-size: 14px;
font-weight: normal;
margin: 0px 0px 30px 0px;
text-transform: uppercase;
}
p {
color: #444444;
}
	</style>
  </head>
  
  <body>
		
		<img src="imgs/planeta.png">
		
		<br><br>
		
		<h1>Error 404</h1>
		<h2>页面没有找到</h2>
		
		<p>亲，你要找啥</p>
		
		<p><a href="./index.jsp">返回首页</a></p>
		
	
</body>

</html>
