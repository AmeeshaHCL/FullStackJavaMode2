package com.pack.AirportManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pack.AirportManagement.model.Manager;
import com.pack.AirportManagement.model.ManagerLogin;
import com.pack.AirportManagement.service.ManagerService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ManagerController {
	@Autowired
	ManagerService managerService;
	@PostMapping("/manager")
	public void addManager(@RequestBody Manager manager) {
      managerService.createManager(manager);
	}
	@PostMapping("/managerlogin")
	public ResponseEntity<Manager> ManagerLogin(@RequestBody ManagerLogin manager) {
		return managerService.login(manager);
	}
	@GetMapping("/manager")
	public Iterable<Manager> getAllManager() {
		return managerService.getAllManagers();
	}
	@DeleteMapping("/deletemanager")
	  public ResponseEntity<HttpStatus> rejectManager(@RequestBody Manager manager){
		return managerService.rejectManager(manager);
	}
	
}
