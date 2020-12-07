package com.pack.AirportManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.AirportManagement.model.Plane;

public interface PlaneDao extends CrudRepository<Plane, Long>{

}
