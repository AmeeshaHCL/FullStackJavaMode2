package com.pack.AirportManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pack.AirportManagement.dao.ManagerDao;
import com.pack.AirportManagement.model.Manager;
import com.pack.AirportManagement.model.ManagerLogin;
@Service
public class ManagerServiceImpl implements ManagerService {

	 @Autowired
	    ManagerDao managerDao;
	    @Override
		public ResponseEntity<Manager> createManager(Manager manager) {
			try {
				Manager _manager = managerDao
						.save(new Manager(manager.getManagerId(),manager.getFirstName(),manager.getLastName(),manager.getAge(),manager.getGender(),manager.getContactNumber(),manager.getPassword()));
				return new ResponseEntity<>(_manager, HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
			}
		}
		@Override
		public ResponseEntity<Manager> login(ManagerLogin manager) {
			Optional<Manager> managerData = managerDao.findById(manager.getManagerId());

		    if (managerData.isPresent()) {
		    	if(manager.getPassword().equals(managerData.get().getPassword())) {
		    		return new ResponseEntity<>(managerData.get(), HttpStatus.OK);
		    	}
		    	else {
		    		return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		    	}
		    	
		    } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		}
		@Override
		public Iterable<Manager> getAllManagers() {
			return managerDao.findAll();
		}

		@Override
		public ResponseEntity<HttpStatus> rejectManager(Manager manager) {
			try {
		    	managerDao.deleteById(manager.getManagerId());
		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		    } catch (Exception e) {
		      return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		    }
		}
		}


