package com.csg.tools;

import java.security.MessageDigest;
import sun.misc.BASE64Encoder;

public class MD5Tools {

	/**
	 * MD5加密
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(MD5function("sdggerg23465"));
	}
	
	public static String MD5function(String s) throws Exception{

		//创建MD5算法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		
		//把String 转化成字节数组
		byte[] bt = md5.digest(s.getBytes());
		
		// 将编码后的数据 通过BASE64转换为String类型     Base64编码的原理是按bit将每6个bit转换成Base64编码表中的相应字符
		BASE64Encoder  en = new BASE64Encoder();
		String encode = en.encode(bt);
		//使用BASE64进行编码
		
		return encode;
	}
	

}
