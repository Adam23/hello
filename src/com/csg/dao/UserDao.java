package com.csg.dao;

import com.csg.domain.User;

public interface UserDao {
	/**
	 * ����û����Ƿ����
	 * @param name �û���
	 * @return user����
	 */
	public abstract User checkByName(String name);
	
	/**
	 * �����û�
	 * @param u ��õ��ķ�װ��UserBean�еĶ���
	 * @return user����
	 */
	public abstract boolean insertUser(User u);

}
