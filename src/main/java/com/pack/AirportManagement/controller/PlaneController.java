package com.pack.AirportManagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pack.AirportManagement.model.Plane;
import com.pack.AirportManagement.service.PlaneService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PlaneController {
	@Autowired
	PlaneService planeService;
	@PostMapping("/planes")
	public void addPlane(@RequestBody Plane plane) {
		planeService.addPlane(plane);
	}
	@GetMapping("/planes")
	public Iterable<Plane> getAllPlanes() {
		return planeService.getAllPlanes();
	}
	@GetMapping("/planes/{id}")
	public ResponseEntity<Plane> getPlaneById(@PathVariable("id") long planeId) {
		return planeService.getPlaneById(planeId);
	}
	@PutMapping(value = "/planes/update")
	  public Plane updatePlane(@RequestBody Plane plane) {
		return planeService.updatePlane(plane);
	}
}
