package com.pack.AirportManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.AirportManagement.model.Admin;
import com.pack.AirportManagement.model.AdminLogin;


import com.pack.AirportManagement.service.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	AdminService adminService;
	@PostMapping("/admin")
	public void addAdmin(@RequestBody Admin admin) {
      adminService.createAdmin(admin);
	}
	@PostMapping("/login")
	public ResponseEntity<Admin> getAdminById(@RequestBody AdminLogin admin) {
		return adminService.getAdminById(admin);
	}
	
	

}
