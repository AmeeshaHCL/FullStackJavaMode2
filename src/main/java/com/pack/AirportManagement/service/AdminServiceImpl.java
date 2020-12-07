package com.pack.AirportManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pack.AirportManagement.dao.AdminDao;
import com.pack.AirportManagement.dao.ManagerDao;
import com.pack.AirportManagement.model.Admin;
import com.pack.AirportManagement.model.AdminLogin;


@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminDao adminDao;
    @Autowired
    ManagerDao managerDao;
	@Override
	public ResponseEntity<Admin> createAdmin(Admin admin) {
		try {
			Admin _admin = adminDao
					.save(new Admin(admin.getFirstName(),admin.getLastName(),admin.getAge(),admin.getGender(),admin.getContactNumber(),admin.getVendorId(),admin.getPassword()));
			return new ResponseEntity<>(_admin, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@Override
	public ResponseEntity<Admin> getAdminById(AdminLogin admin) {
		Optional<Admin> adminData = adminDao.findById(admin.getAdminId());

	    if (adminData.isPresent()) {
	    	if(admin.getPassword().equals(adminData.get().getPassword())) {
	    		return new ResponseEntity<>(adminData.get(), HttpStatus.OK);
	    	}
	    	else {
	    		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	    	}
	    	
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

	

	
}
