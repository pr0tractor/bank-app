package com.bank.beans;

public abstract class User {
	public String userName;
	public String passWord;
	public String name;
	public String address;
	public String dob;
	public String accountType;
	//constructor 
	public User(String un, String pw, String name, String address, String dob) {
		this.userName = un;
		this.passWord = pw;
		this.name = name;
		this.address = address;
		this.dob = dob;
		
	}
	//getters and setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
