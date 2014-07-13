<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>提示页面</title>
    
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
  
    
    ${message}
    
    <!-- 参考  EL表达式  笔记  中的 对map操作 formerror 是属性名  
    	errorname 是map中的key  ----这些信息在FormBean中封装的
    
	  用户名：  ${formerror.errorname} <br/>
	  密码：     ${formerror.errorpwd}<br/>
	  重复密码：  ${formerror.errorrepwd}<br/>
	  邮箱：  ${formerror.erroremail}<br/>   -->
	  
  </body>
</html>
