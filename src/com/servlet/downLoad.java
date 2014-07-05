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
		
		//1、获取要操作的 文件   
		String path = "/imgs/qin.gif"; //所在的位置 --相对路径
		//2 获取的是绝对路径 --》在web服务器上 真实的路径  ----ServletContext -->在一个web项目中 只有一个 
		ServletContext context = this.getServletContext();
		String realpath = context.getRealPath(path); //将相对路径转换为绝对路径
		System.out.println(realpath );
		
		// 让客户端 以下载的形式进行打开
		response.setHeader("Content-Disposition", "attachment;filename=aaa.gif");
		
		//3 进行输出
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
