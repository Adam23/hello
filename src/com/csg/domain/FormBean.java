package com.csg.domain;

public class FormBean {
	private String id;
	private String username;
	private String pwd;
	private String repwd;
	private String email;
	private String phone;
	private String birthday;

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
	public String getRepwd() {
		return repwd;
	}
	public void setRepwd(String repwd) {
		this.repwd = repwd;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	public FormBean(){}
	
	public FormBean(String id, String username, String pwd, String repwd,
			String email, String phone, String birthday) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.repwd = repwd;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	}
}
