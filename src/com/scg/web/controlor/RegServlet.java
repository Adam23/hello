package com.scg.web.controlor;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			//���������ݷ�װ��FormBean��
			FormBean fb = (FormBean) Form2Bean.toBean(request, Class.forName("com.csg.domain.FormBean"));
			
			//��FormBean ��װ��UserBean��
			User user = new User();
			ConvertUtils.register(new DateLocaleConverter(), Date.class); //java.util
			BeanUtils.copyProperties(user, fb);
			
			//����service���ע�᷽��
			boolean reg = us.Register(user);
			if(reg){
				response.getWriter().write("succses");
			}else{
				response.getWriter().write("error");
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