package com.csg.test;

import org.junit.Test;

import com.csg.jdbc.JdbcTest;

public class TestFunction {
	@Test
	public void testFun1(){
		JdbcTest jt = new JdbcTest();
		int str = jt.chu();
	}

}
