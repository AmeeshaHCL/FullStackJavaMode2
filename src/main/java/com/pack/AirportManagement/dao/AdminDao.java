package com.pack.AirportManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.AirportManagement.model.Admin;

public interface AdminDao extends CrudRepository<Admin, Long> {

}
