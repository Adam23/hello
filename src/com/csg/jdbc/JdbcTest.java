package com.csg.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
		try {
			conn = JdbcTools.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from csg_user");
			while (rs.next()) {
				System.out.println(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcTools.close(rs, stmt, conn);
		}
		
	}
	
	public int chu(){
		return 9/0;
	}

}
