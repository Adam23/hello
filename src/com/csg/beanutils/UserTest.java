package com.csg.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class UserTest {

	/**
	 * 使用BeanUtils操作属性的动态getter,setter ----------so easy
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		User user = new User();
		BeanUtils.setProperty(user, "name", "hyk");
		String my = BeanUtils.getProperty(user, "name");
		System.out.println(my);
		
		//将String类型转化成Date类型
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		BeanUtils.setProperty(user, "birthday", "2014-7-11");
		String birth = BeanUtils.getProperty(user, "birthday");
		System.out.println(birth);
		
		HashMap hm = new HashMap();
		hm.put("name", "adam");
		hm.put("age", 25);
		hm.put("birthday", "1990-7-11");
		
		//将String类型转化成Date类型
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		// 将map中的值 放入到javaBean中 但是名称要一致
		BeanUtils.populate(user, hm);
		
	}

}
