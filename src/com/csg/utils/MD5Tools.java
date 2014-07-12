package com.csg.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * MD5加密工具
 * @author csg
 *
 */
public class MD5Tools {

	/**
	 * MD5加密方法
	 * 参数   字符串
	 * 返回   加密后的字符串
	 */
	public static String MD5function(String s){

		//创建MD5算法
		MessageDigest md5 = null;
		String encode = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
			//把String 转化成字节数组
			byte[] bt = md5.digest(s.getBytes());
			
			// 将编码后的数据 通过BASE64转换为String类型     Base64编码的原理是按bit将每6个bit转换成Base64编码表中的相应字符
			BASE64Encoder  en = new BASE64Encoder();
			//使用BASE64进行编码
			encode = en.encode(bt);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encode;
	}
}
