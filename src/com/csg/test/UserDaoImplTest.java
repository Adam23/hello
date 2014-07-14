package com.csg.test;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.csg.dao.impl.UserDaoImpl;
import com.csg.domain.User;

public class UserDaoImplTest {
	UserDaoImpl udi  = new UserDaoImpl();
	@Test
	public void testCheckByName() {
		
		User u = udi.checkByName("csg");
		System.out.println(u);
	}
	
	@Test
	public final void insertUser(){
		User u = new User("3333","lll","123123","tt@x.com","15804040404",new Date());
		boolean t = udi.insertUser(u);
		Assert.assertTrue(t);
	}
	
	@Test
	public void testFindAll() {
		List<User> findAllUsers = udi.findAllUsers();
		System.out.println(findAllUsers.size());
	}
}
