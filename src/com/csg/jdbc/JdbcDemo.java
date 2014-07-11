package com.csg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		//1��������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 ��������
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
		
		//3 ����statement����
		Statement stmt = conn.createStatement();
		
		//4 ����
		ResultSet  rs = stmt.executeQuery("select * from csg_user");
		
		while (rs.next()) {
			System.out.println(rs.getString("password"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}

}
