package com.pack.AirportManagement.service;

import org.springframework.http.ResponseEntity;
import com.pack.AirportManagement.model.Plane;

public interface PlaneService {

	public ResponseEntity<?> addPlane(Plane plane);

	public Iterable<Plane> getAllPlanes();
	
	public ResponseEntity<Plane> getPlaneById(long planeId);

	public Plane updatePlane(Plane plane);


}
