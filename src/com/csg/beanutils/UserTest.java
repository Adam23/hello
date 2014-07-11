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
	 * ʹ��BeanUtils�������ԵĶ�̬getter,setter ----------so easy
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		User user = new User();
		BeanUtils.setProperty(user, "name", "hyk");
		String my = BeanUtils.getProperty(user, "name");
		System.out.println(my);
		
		//��String����ת����Date����
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		BeanUtils.setProperty(user, "birthday", "2014-7-11");
		String birth = BeanUtils.getProperty(user, "birthday");
		System.out.println(birth);
		
		HashMap hm = new HashMap();
		hm.put("name", "adam");
		hm.put("age", 25);
		hm.put("birthday", "1990-7-11");
		
		//��String����ת����Date����
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		// ��map�е�ֵ ���뵽javaBean�� ��������Ҫһ��
		BeanUtils.populate(user, hm);
		
	}

}
