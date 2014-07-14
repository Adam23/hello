<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>show</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- Bootstrap -->
	<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<script src="http://lib.sinaapp.com/js/jquery/1.8/jquery.min.js"></script>

  </head>
  
  <body>
  	<form action="" id="frm" method="post">
    <table>
    	<thead>
    		<tr>
    			<th>id</th>
    			<th>用户名</th>
    			<th>邮箱</th>
    			<th>手机</th>
    			<th>生日</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach items="${allUsers}" var="alluser" varStatus="temp">
    			<tr>
    				<td>${temp.count }</td>
    				<td>${alluser.username }</td>
    				<td>${alluser.email }</td>
    				<td>${alluser.phone }</td>
    				<td>${alluser.birthday }</td>
    			</tr>
    		</c:forEach>
    	</tbody>
    </table>
    </form>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
