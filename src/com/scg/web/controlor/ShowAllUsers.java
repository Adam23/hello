package com.scg.web.controlor;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csg.domain.User;
import com.csg.service.UserService;
import com.csg.service.impl.UserServiceImpl;

public class ShowAllUsers extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//调用findAllUsers方法
		UserService us = new UserServiceImpl();
		List<User> findAll = us.FindAllUsers();
		
		if(findAll!=null && findAll.size()>0){
			//添加到作用域
			request.setAttribute("allUsers", findAll);
			//跳转到展示数据的页面
			request.getRequestDispatcher("/WEB-INF/jsps/show.jsp").forward(request, response);
		}else{
			//有错误进行提示
			request.setAttribute("message", "信息不存在,还未录入");
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
