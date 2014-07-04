package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hello extends HttpServlet{


	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=utf-8");
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
