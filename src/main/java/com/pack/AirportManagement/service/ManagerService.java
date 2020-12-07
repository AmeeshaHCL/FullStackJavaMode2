package com.pack.AirportManagement.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.pack.AirportManagement.model.Manager;
import com.pack.AirportManagement.model.ManagerLogin;

public interface ManagerService {
	public ResponseEntity<?> createManager(Manager manager);

	public ResponseEntity<Manager> login(ManagerLogin manager);
	 public Iterable<Manager> getAllManagers();
	public ResponseEntity<HttpStatus> rejectManager(Manager manager);
}
