package com.pack.AirportManagement.service;


import org.springframework.http.ResponseEntity;

import com.pack.AirportManagement.model.Admin;
import com.pack.AirportManagement.model.AdminLogin;



public interface AdminService {

	public ResponseEntity<?> createAdmin(Admin admin);
	public ResponseEntity<Admin> getAdminById(AdminLogin admin);

   
}
