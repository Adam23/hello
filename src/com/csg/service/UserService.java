package com.csg.service;

import com.csg.domain.User;

public interface UserService {

	public abstract boolean Register(User u);
	
	public abstract boolean Login(String name, String pwd);

}