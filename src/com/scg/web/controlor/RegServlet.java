package com.scg.web.controlor;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import com.csg.domain.FormBean;
import com.csg.domain.User;
import com.csg.service.UserService;
import com.csg.service.impl.UserServiceImpl;
import com.csg.utils.Form2Bean;

public class RegServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService us = new UserServiceImpl();
		try {
			//将表单数据封装到FormBean中
			FormBean fb = (FormBean) Form2Bean.toBean(request, Class.forName("com.csg.domain.FormBean"));
			
			if(!fb.test()){
				//用于回显已填的注册信息
				request.setAttribute("formbean", fb );
				//用于错误提示
				request.setAttribute("formerror", fb.getError());
				request.getRequestDispatcher("/WEB-INF/jsps/register.jsp").forward(request, response);
				return ;
			}
			
			//将FormBean 封装到UserBean中
			User user = new User();
			ConvertUtils.register(new DateLocaleConverter(), Date.class); //java.util
			BeanUtils.copyProperties(user, fb);
			
			//调用service层的注册方法
			boolean reg = us.Register(user);
			if(reg){
				HttpSession  session = request.getSession();
				session.setAttribute("userbean", user);
				request.setAttribute("message", "注册成功,3秒后转向主页！<meta http-equiv='refresh' content='3;url=index.jsp'> 恭喜你登录成功，立即跳转！ ");
				request.getRequestDispatcher("message.jsp").forward(request, response); 
			}else{
				HttpSession  session = request.getSession();
				session.setAttribute("message", "注册失败~~~");
				request.getRequestDispatcher("message.jsp").forward(request, response); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
