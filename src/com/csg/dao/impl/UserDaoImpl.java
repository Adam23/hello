package com.csg.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.csg.dao.UserDao;
import com.csg.domain.User;
import com.csg.utils.JdbcTools;

public class UserDaoImpl implements UserDao {

	/**
	 * 实现checkByName接口
	 */
	public User checkByName(String name) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		User u = null;
		try {
			conn = JdbcTools.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from user where username='"+name+"'");
			while (rs.next()) {
				u = new User();
				u.setId(rs.getString("id"));
				u.setUsername(name);
				u.setPwd(rs.getString("pwd"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				u.setBirthday(new Date(rs.getDate("birthday").getTime()));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcTools.close(rs, stmt, conn);
		}
		
		return u;
	}

	/**
	 * 实现insertUser接口
	 */
	public boolean insertUser(User u) {
		Connection conn = null;
		//PreparedStatement stmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcTools.getConn();
			/*String sql = "insert into user values(?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, u.getId());
			stmt.setString(2, u.getUsername());
			stmt.setString(3, u.getPwd());
			stmt.setString(4, u.getEmail());
			stmt.setString(5, u.getPhone());
			stmt.setDate(6, new java.sql.Date(u.getBirthday().getTime()));
			
			int n = stmt.executeUpdate();*/
			stmt = conn.createStatement();
			String sql = "insert into user values('"+u.getId()+"','"+u.getUsername()+"','"+u.getPwd()+"','"+u.getEmail()
			+"','"+u.getPhone()+"','"+(new java.sql.Date(u.getBirthday().getTime()))+"','','');";
			int n = stmt.executeUpdate(sql);
			if(n>0){
				System.out.println("注册成功");
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcTools.close(rs, stmt, conn);
		}
		return false;
	}
	

}
