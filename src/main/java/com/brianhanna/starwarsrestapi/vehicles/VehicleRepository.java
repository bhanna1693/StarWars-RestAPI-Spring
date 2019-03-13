package com.brianhanna.starwarsrestapi.vehicles;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	List<Vehicle> findByName(String name);
	List<Vehicle> findByVehicleType(String vehicleType);
	List<Vehicle> findByAlignment(String alignment);
	
}
