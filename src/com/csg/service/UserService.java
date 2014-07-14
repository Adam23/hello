package com.csg.service;

import com.csg.domain.User;

public interface UserService {

	/**
	 * 用户注册
	 * @param u 
	 * @return
	 */
	public abstract boolean Register(User u);
	
	/**
	 * 用户登录
	 * @param name 用户名
	 * @param pwd  密码
	 * @return
	 */
	public abstract User Login(String name, String pwd);

}