package com.brianhanna.starwarsrestapi.vehicles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starwarsapi")
public class VehicleController {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@RequestMapping("/vehicles")
	public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll();
	}
	
	@RequestMapping("/vehicles/alignment")
	public List<Vehicle> findByName(@RequestParam String alignment) {
		String alignmentUpper = alignment.substring(0, 1).toUpperCase() + alignment.substring(1);
		List<Vehicle> result = vehicleRepository.findByAlignment(alignmentUpper);
		return result;
	}
}
