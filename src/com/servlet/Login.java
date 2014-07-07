package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String userName=request.getParameter("name"); 
		String userPwd=request.getParameter("pwd"); 
		
		
		Cookie[] cookies = request.getCookies();//第一次访问有可能为null
		System.out.println(cookies);
		for(int i=0;cookies!=null&&i<cookies.length;i++){
			Cookie cookie = cookies[i];
			if("last_time".equals(cookie.getName())){
				//输出值
				long value = Long.parseLong(cookie.getValue());
				out.println(value );
			}
		}

		out.println("<a href='"+request.getContextPath()+"/ClearServlet'>清空Cookie</a>");	
		//把当前的时间写给客户端
		Cookie c = new Cookie("last_time",System.currentTimeMillis()+"");
		c.setPath(request.getContextPath());//   该cookie只能被当前应用访问
		c.setMaxAge(10*24*60*60);//存活时间。默认是浏览器进程 
		response.addCookie(c);

		out.flush();
		out.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
