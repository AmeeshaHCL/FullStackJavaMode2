package com.pack.AirportManagement.model;

public class ManagerLogin {
private long managerId;
private String password;
public ManagerLogin() {
	super();
	// TODO Auto-generated constructor stub
}
public ManagerLogin(long managerId, String password) {
	super();
	this.managerId = managerId;
	this.password = password;
}
public long getManagerId() {
	return managerId;
}
public void setManagerId(long managerId) {
	this.managerId = managerId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "ManagerLogin [managerId=" + managerId + ", password=" + password + "]";
}

}
