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
		// ���ѡ���ˣ����û���д��cookie��
		Cookie c = new Cookie("jizhuyonghuming", name);
		c.setPath(request.getContextPath());
		c.setMaxAge(Integer.MAX_VALUE);// ���ñ���
		response.addCookie(c);
	}
	response.setContentType("text/html;charset=UTF-8");
	response.getWriter().println(name + "��½�ɹ���");
}

}
