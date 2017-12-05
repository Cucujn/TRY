package com.vo;

public class Vo {
	private String userId;
	private String userName;
	private String password;
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vo(String userId,String userName,String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
