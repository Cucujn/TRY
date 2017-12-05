package com.cjn.homework;

public class student {
	protected String stuName;
	protected String sex;
	protected int age;
	
	public student() {
		super();
	}
	public student(String name,String sex,int age) {
		super();
		// TODO Auto-generated constructor stub
		this.stuName = name;
		this.age = age;
		this.sex = sex;
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
