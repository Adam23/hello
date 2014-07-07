package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		dd(request, response);
}

public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		dd(request, response);
}

private void dd(HttpServletRequest request, HttpServletResponse response)
	throws IOException {
	String remember = request.getParameter("remember");
	String name = "";
	if (remember != null ||!remember.trim().equals("") ) {
		name = request.getParameter("username");
		// 如果选中了，把用户名写到cookie中
		Cookie c = new Cookie("jizhuyonghuming", name);
		c.setPath(request.getContextPath());
		c.setMaxAge(Integer.MAX_VALUE);// 永久保存
		response.addCookie(c);
	}
	response.setContentType("text/html;charset=UTF-8");
	response.getWriter().println(name + "登陆成功！");
}

}
