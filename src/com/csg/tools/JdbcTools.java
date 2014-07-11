package com.csg.tools;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcTools {

	//驱动名
	private static String driverName;
	
	//数据库连接地址
	private static String url;

	//数据库user
	private static String username;
	
	//数据库password
	private static String pwd;
	
	static{
		try {
			InputStream ins = JdbcTools.class.getClassLoader().getResourceAsStream("jdbc.properties"); 
			Properties  prop = new Properties();
			prop.load(ins);
			driverName = prop.getProperty("driverClassName");
			url =prop.getProperty("jdbcurl");
			username = prop.getProperty("username");
			pwd = prop.getProperty("password");
			System.out.println("driverName"+driverName);
			System.out.println("url"+url);
			
			//加载驱动
			Class.forName(driverName);
		} catch (Exception e) {
			throw new RuntimeException("加载数据库出错了" +e);
		}
	}

	
	/**
	 * 获取连接
	 * @return
	 * @throws SQLException 
	 */
	public static  Connection getConn() throws SQLException{
		Connection conn = DriverManager.getConnection(url, username, pwd);
		return conn;
	}

	/**
	 * 关闭连接
	 * @return 
	 */
	public static void close(ResultSet rs,Statement stmt,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs=null;
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt=null;
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn=null;
		}
	}
	
}
