<%@page import="com.servlet.Addresss"%>
<%@page import="com.servlet.Person"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>1111111111</title>

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
    <jsp:useBean id="per" class="com.servlet.Person" scope="application"></jsp:useBean>
    <% per.setName("yiyi"); %>
    <%=per.getName()%>
    
    <hr>
    <%
    	Object obj = pageContext.findAttribute("per");
        com.servlet.Person p = (com.servlet.Person)obj;
        p.setAge(99);
    %>
    <%=per.getAge() %>
    <hr>
    ${per.name}
    
    <hr>
    <% 
    Person pp = new Person();
    pp.setName("CSG");
    Addresss add = new Addresss();
    pp.setAdd(add);
    application.setAttribute("p",pp);//将属性设置到application作用域
    %> 
    p.add.city========${p.add.city }
    
    <hr>
    <%
    ArrayList list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    session.setAttribute("mList",list);//将属性设置到session作用域
    %>
    ${mList[2]}
    <hr>
    <%
    HashMap hm = new HashMap();
    hm.put("name","hanyike");
    hm.put("age",24);
    pageContext.setAttribute("yiyi",hm);//将属性设置到page作用域
    %>
    yiyi———————————— ${yiyi.name }，${yiyi.age }岁<br>
         是否为empty----------- ${empty yiyi }
         
    <hr>
    ${param.name }
  </body>
</html>
