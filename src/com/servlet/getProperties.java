package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jmx.snmp.Enumerated;

public class getProperties extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��ȡ�������ļ�
		String path= this.getServletContext().getRealPath("/WEB-INF/my.properties");
		
		//����propertie�����ȡ
		Properties pp = new Properties();
		FileInputStream fis = new FileInputStream(path);
		pp.load(fis);
		
		System.out.println(pp.getProperty("name"));
		Enumeration ppNames = pp.propertyNames();
		while (ppNames.hasMoreElements()) {
			String key  = (String) ppNames.nextElement();
			System.out.println(pp.getProperty(key));
			
		}
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
