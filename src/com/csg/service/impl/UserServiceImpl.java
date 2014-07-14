package com.csg.service.impl;

import java.util.Date;
import java.util.List;

import com.csg.dao.UserDao;
import com.csg.dao.impl.UserDaoImpl;
import com.csg.domain.User;
import com.csg.service.UserService;
import com.csg.utils.IdCreater;
import com.csg.utils.MD5Tools;


public class UserServiceImpl implements UserService  {
	
	//创建dao层类的对象（这里，使用了多态）
	UserDao ud = new UserDaoImpl();
	/**
	 * 用户注册
	 */
	public boolean Register(User u){
		
		//调用dao层判断用户是否存在
		User user = ud.checkByName(u.getUsername());
		if(user!=null){
			return false;
		}
		
		//若用户名不存在则注册：1.生成UUID   2.密码加密
		u.setId(IdCreater.getRadomId());
		u.setPwd(MD5Tools.MD5function(u.getPwd()));
		boolean regist = ud.insertUser(u);
		if(regist){
			return true;
		}else{
			return false;
		}
		
	}

	/**
	 * 用户登陆
	 */
	public User Login(String name, String pwd) {
		
		//调用dao层判断用户是否存在
		User user = ud.checkByName(name);
		if(user!=null){
			if(user.getPwd().equals(MD5Tools.MD5function(pwd))){
				return user;
			}else{
				user = new User("", name, "", "", "", new Date());
				return user;
			}
		}
		return user;
	}

	/*
	 * 查看用户
	 * (non-Javadoc)
	 * @see com.csg.service.UserService#FindAllUsers()
	 */
	public List<User> FindAllUsers() {
		return  ud.findAllUsers();
	}
}
