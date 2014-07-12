package com.csg.service.impl;

import com.csg.dao.UserDao;
import com.csg.dao.impl.UserDaoImpl;
import com.csg.domain.User;
import com.csg.service.UserService;
import com.csg.utils.IdCreater;
import com.csg.utils.MD5Tools;


public class UserServiceImpl implements UserService  {
	/**
	 * �û�ע��
	 */
	public boolean Register(User u){
		//����dao����Ķ������ʹ���˶�̬��
		UserDao ud = new UserDaoImpl();
		
		//����dao���ж��û��Ƿ����
		User user = ud.checkByName(u.getUsername());
		if(user!=null){
			return false;
		}
		
		//���û�����������ע�᣺1.����UUID   2.�������
		u.setPwd(MD5Tools.MD5function(u.getPwd()));
		u.setId(IdCreater.getRadomId());
		boolean regist = ud.insertUser(u);
		if(regist){
			return true;
		}else{
			return false;
		}
	}
}
