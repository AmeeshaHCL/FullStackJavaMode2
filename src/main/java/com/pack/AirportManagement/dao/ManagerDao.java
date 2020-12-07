package com.pack.AirportManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.AirportManagement.model.Manager;

public interface ManagerDao extends CrudRepository<Manager, Long>{

}
