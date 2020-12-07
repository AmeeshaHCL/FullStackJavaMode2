package com.pack.AirportManagement.service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.pack.AirportManagement.dao.PlaneDao;
import com.pack.AirportManagement.model.Plane;

@Service
public class PlaneServiceImpl implements PlaneService {
    @Autowired
    PlaneDao planeDao;
	@Override
	public ResponseEntity<Plane> addPlane(Plane plane) {
		try {
			Plane _plane = planeDao
					.save(new Plane(plane.getCarrierName(),plane.getPlaneModel(),plane.getSeatCapacity()));
			return new ResponseEntity<>(_plane, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	@Override
	public Iterable<Plane> getAllPlanes() {
		return planeDao.findAll();
	}
	@Override
	public ResponseEntity<Plane> getPlaneById(long planeId) {
		Optional<Plane> planeData = planeDao.findById(planeId);

	    if (planeData.isPresent()) {
	      return new ResponseEntity<>(planeData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	@Override
	public Plane updatePlane(Plane plane) {
		 System.out.println("Information update");
		  //  System.out.println("into update"+customer.getId()+" "+customer.getName());
		         Plane plane1 = planeDao.save(new Plane(plane.getPlaneId(),plane.getCarrierName(),plane.getPlaneModel(),plane.getSeatCapacity()));
		    return plane1;
	}

}
