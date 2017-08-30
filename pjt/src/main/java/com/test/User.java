package com.test;

public class User {

	private int userNum;
	private String userName;
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString(){
		return "User{"
				+ "userNum="+userNum +
				", userName='" + userName + "/'" +
				'}';
	}
}
