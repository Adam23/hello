package com.csg.test;

import java.util.Date;

import org.junit.Test;

import com.csg.domain.User;
import com.csg.service.impl.UserServiceImpl;

public class UserServiceImplTest {
	UserServiceImpl usi = new UserServiceImpl();
	@Test
	public void testRegister() {
		User u = new User("","csg","123456","tt@yiyi.com","15804069271",new Date());
		System.out.println(usi.Register(u));
	}
	
	@Test
	public void testLogin() {
		System.out.println(usi.Login("csg1","123456"));
	}
	
	@Test
	public void test() {
		System.out.println(usi.FindAllUsers().size());
	}

}
