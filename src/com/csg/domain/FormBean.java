package com.csg.domain;

import java.util.HashMap;

public class FormBean {
	private String id;
	private String username;
	private String pwd;
	private String repwd;
	private String email;
	private String phone;
	private String birthday;
	//封装Error
	private HashMap<String, String> error  = new HashMap<String, String>();

	public HashMap<String, String> getError() {
		return error;
	}
	public void setError(HashMap<String, String> error) {
		this.error = error;
	}
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
	
	/**
	 * 验证表单内容是否合法
	 * @return
	 */
	public boolean test(){
		boolean flag = false;
		int count = 0;
		
		//验证用户名
		flag = username.matches("\\w{4,12}");
		if(username!=null&&!username.trim().equals("")&&flag){
			count++;
		}else{
			error.put("username", "用户名请以字母开头，不能少于4位啊亲");
		}
		
		//密码
		flag = pwd.matches("\\w{3,16}");
		if(pwd!=null&&!username.trim().equals("")&&flag){
			count++;
			//判断两次密码是否一致
			if(repwd.equals(pwd)){
				count++;
			}else{
				error.put("repwd", "两次密码不一致！！你在逗我么亲(╯3╰)");
			}
		}else{
			error.put("pwd", "密码只能是字母、数字和下划线， 3-16位");
		}
		
		//邮箱
		flag = email.matches("\\w+@\\w+(\\.\\w+)+");
		if(email!=null && !email.trim().equals("") && flag){
			count++;
		}else{
			error.put("email", "不符合邮箱规则");
		}
		
		//手机
		flag = phone.matches("1[3-8]\\d{9}");
		if(phone!=null && !phone.trim().equals("") && flag){
			count++;
		}else{
			error.put("phone", "手机号格式不正确");
		}
		
		//判断日期是否为null
		if(birthday!=null && !birthday.trim().equals("")){
			count++;
		}else{
			error.put("birthday", "不填生日，怎么祝你生快");
		}
		
		if(count==6){
			return true;
		}else{
			return false;
		}
	}
}
