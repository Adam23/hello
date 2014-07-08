package com.servlet;

public class Person {
	private String name="";
	private int age;
	private Addresss add;
	
	public Addresss getAdd() {
		return add;
	}
	public void setAdd(Addresss add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(){}
}
