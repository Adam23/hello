package com.csg.tools;

import java.security.MessageDigest;
import sun.misc.BASE64Encoder;

public class MD5Tools {

	/**
	 * MD5����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(MD5function("sdggerg23465"));
	}
	
	public static String MD5function(String s) throws Exception{

		//����MD5�㷨
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		
		//��String ת�����ֽ�����
		byte[] bt = md5.digest(s.getBytes());
		
		// ������������ ͨ��BASE64ת��ΪString����     Base64�����ԭ���ǰ�bit��ÿ6��bitת����Base64������е���Ӧ�ַ�
		BASE64Encoder  en = new BASE64Encoder();
		String encode = en.encode(bt);
		//ʹ��BASE64���б���
		
		return encode;
	}
	

}
