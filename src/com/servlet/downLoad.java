package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class downLoad extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		//1����ȡҪ������ �ļ�   
		String path = "/imgs/qin.gif"; //���ڵ�λ�� --���·��
		//2 ��ȡ���Ǿ���·�� --����web�������� ��ʵ��·��  ----ServletContext -->��һ��web��Ŀ�� ֻ��һ�� 
		ServletContext context = this.getServletContext();
		String realpath = context.getRealPath(path); //�����·��ת��Ϊ����·��
		System.out.println(realpath );
		
		// �ÿͻ��� �����ص���ʽ���д�
		response.setHeader("Content-Disposition", "attachment;filename=aaa.gif");
		
		//3 �������
		InputStream in = new FileInputStream(realpath);
		OutputStream out = response.getOutputStream();
		byte buf[] = new byte[1024];
		int len = -1;
		while((len=in.read(buf))!=-1){
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}

}
