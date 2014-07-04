package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hello extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");

		//获取输出流对象 
		//PrintWriter pw = resp.getWriter(); 
		ServletOutputStream pw = resp.getOutputStream(); 
		pw.write((65+"").getBytes());
		   
		pw.write("<hr />".getBytes());
		   
		//进行输出
		pw.write("hello  world   how are you <br />".getBytes());
		pw.write("hello  world   how are you".getBytes());
			
		pw.write("<hr />".getBytes());
		
		pw.write("<input type=\"text\"  name=\"xxx\" />".getBytes());
		
		pw.write("<a href='http://www.ifeng.com' > 凤凰 </a>".getBytes("utf-8"));
	 
		pw.write("<hr />".getBytes());
		pw.write(("姓名   " +  req.getParameter("username")).getBytes("utf-8"));
		pw.write( ("密码 " +  req.getParameter("pwd")).getBytes("utf-8"));
		pw.write("<hr />".getBytes()); 
		/*System.out.println(" ===  " + req.getParameter("user"));
		System.out.println(" ===  " + req.getParameter("pwd"));
		
		System.out.println( "req.getRemoteAddr()  = "+req.getRemoteAddr() );
		System.out.println( "req.getRemotePort()  = "+req.getRemotePort() );
		
		System.out.println( "req.getLocalAddr()  =  " + req.getLocalAddr() );
		System.out.println( "req.getLocalPort() " + req.getLocalPort() );*/
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
