package com.java.infinite;

public class Login {
	
	private String userName;
	private String PassCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassCode() {
		return PassCode;
	}
	public void setPassCode(String passCode) {
		PassCode = passCode;
	}
	public Login(String userName, String passCode) {
		super();
		this.userName = userName;
		PassCode = passCode;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", PassCode=" + PassCode + "]";
	}
	
	
}
