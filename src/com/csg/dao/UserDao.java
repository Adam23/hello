package com.csg.dao;

import com.csg.domain.User;

public interface UserDao {
	/**
	 * 检查用户名是否存在
	 * @param name 用户名
	 * @return user对象
	 */
	public abstract User checkByName(String name);
	
	/**
	 * 新增用户
	 * @param u 获得到的封装在UserBean中的对象
	 * @return user对象
	 */
	public abstract boolean insertUser(User u);

}
