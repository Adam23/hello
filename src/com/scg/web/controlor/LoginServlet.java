package com.scg.web.controlor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.csg.domain.User;
import com.csg.service.UserService;
import com.csg.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	UserService us = new UserServiceImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取表单中的数据
		String name = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		
		//调用Service层中的登录方法
		User u = null;
		if(name!=null && pwd !=null && !name.trim().equals("")&& !pwd.trim().equals("")){
			u = us.Login(name, pwd);
			//进行判断 处理
			if(u==null){
				request.setAttribute("message", "用户名不存在");
				request.getRequestDispatcher("message.jsp").forward(request, response); 
				
			}else if(u.getId()==null||u.getId().equals("")){
				request.setAttribute("message", "密码不对");
				request.getRequestDispatcher("message.jsp").forward(request, response); 
			}else{
				HttpSession  session = request.getSession();
				session.setAttribute("loginuser", u);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
