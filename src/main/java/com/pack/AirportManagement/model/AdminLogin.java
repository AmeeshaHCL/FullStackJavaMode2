package com.pack.AirportManagement.model;




public class AdminLogin {
	private long adminId;
	private String password;

	public AdminLogin() {
		super();

	}

	public AdminLogin(long adminId, String password) {
		super();
		this.adminId = adminId;
		this.password = password;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminLogin [adminId=" + adminId + ", password=" + password + "]";
	}

}
