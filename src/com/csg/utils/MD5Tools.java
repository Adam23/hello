package com.csg.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * MD5���ܹ���
 * @author csg
 *
 */
public class MD5Tools {

	/**
	 * MD5���ܷ���
	 * ����   �ַ���
	 * ����   ���ܺ���ַ���
	 */
	public static String MD5function(String s){

		//����MD5�㷨
		MessageDigest md5 = null;
		String encode = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
			//��String ת�����ֽ�����
			byte[] bt = md5.digest(s.getBytes());
			
			// ������������ ͨ��BASE64ת��ΪString����     Base64�����ԭ���ǰ�bit��ÿ6��bitת����Base64������е���Ӧ�ַ�
			BASE64Encoder  en = new BASE64Encoder();
			//ʹ��BASE64���б���
			encode = en.encode(bt);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encode;
	}
}
