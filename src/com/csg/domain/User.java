package com.csg.domain;

import java.util.Date;

public class User {
	private String id;
	private String username;
	private String pwd;
	private String email;
	private String phone;
	private Date birthday;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public User(String id, String username, String pwd, String email,
			String phone, Date birthday) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	}
	public User(){}
}
