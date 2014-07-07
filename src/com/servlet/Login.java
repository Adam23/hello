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

		String name ="";
		String mycheck = "";
		Cookie[] coo = request.getCookies();
		for (int i = 0; coo != null &&i < coo.length; i++) { 
			Cookie cookie = coo[i];
			if("jizhuyonghuming".equals(cookie.getName())){
				 name = cookie.getValue();
				 mycheck = "checked=checked";
			}
		}
		 

		// 显示出登陆页面
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>用户登陆</title></head>");
		out.println("<body>");
		out.println("<form action='Login2' method='post'>");
		out.println("<table width='400' border='1'>");
		out.println("<tr>");
		out.println("<td>用户名</td>");
		out.println("<td><input type='text' name='username' value='"+ name +"' /></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>密码</td>");
		out.println("<td><input type='password' name='password'/></td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td colspan='2'><input type='checkbox' name='remember' value='aabb' "+ mycheck + " />记住用户名</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td colspan='2'><input type='submit' value='登录'/></td>");
		out.println("</tr>");

		out.println("</table>");
		out.println("</form>");
		out.println("</body>");

		out.println("</html>");
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
