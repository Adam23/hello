<%@page import="com.servlet.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'jstl.jsp' starting page</title>

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
  	
    This is my JSP page. <br>
    <%
    Person pp = new Person();
    pp.setName("CSG");
    application.setAttribute("p",pp);//将属性设置到application作用域
    %>
    
    <c:out value="111"  default="22222222"></c:out><br>
    <c:set var="like" value="yiyi" scope="application"></c:set>
    ${like }
    
   <%-- <c:import url="http://www.baidu.com"></c:import>--%>
   	<c:redirect><c:redirect url="404.jsp" />  </c:redirect>
  </body>
</html>
