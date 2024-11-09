package com.JDBC_PreparedStatement;

import java.util.Date;

public class UserBean {

	private int Id;
	private String First_Name;
	private String Last_Name;
	private String Login_id;
	private String Password;
	private String Address;
	private Date DOB;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getLoginId() {
		return Login_id;
	}
	public void setLoginId(String loginId) {
		Login_id = loginId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	}