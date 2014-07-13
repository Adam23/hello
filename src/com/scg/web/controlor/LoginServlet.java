package com.scg.web.controlor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csg.service.UserService;
import com.csg.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService us = new UserServiceImpl();
		String name = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		int flag = us.Login(name, pwd);
		if(flag==2){
			HttpSession  session = request.getSession();
			request.setAttribute("message", "登陆成功,3秒后转向主页！<meta http-equiv='refresh' content='3;url=index.jsp'> 恭喜你登录成功，立即跳转！ ");
			request.getRequestDispatcher("message.jsp").forward(request, response); 
		}else if(flag==1){
			request.setAttribute("message", "密码不对");
			request.getRequestDispatcher("message.jsp").forward(request, response); 
		}else{
			request.setAttribute("message", "用户名不存在");
			request.getRequestDispatcher("message.jsp").forward(request, response); 
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
