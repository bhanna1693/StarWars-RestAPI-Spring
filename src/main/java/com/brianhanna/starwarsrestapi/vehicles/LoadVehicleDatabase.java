package com.brianhanna.starwarsrestapi.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadVehicleDatabase implements CommandLineRunner {

	@Autowired
	VehicleRepository vehicleRepository;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		vehicleRepository.save(new Vehicle("Millenium Falcon", "Light Freighter", "Rebel", "Laser Cannons and Concussion Missles"));
		vehicleRepository.save(new Vehicle("X-Wing", "Starfighter", "Rebel", "Laser Cannons and Proton Torpedos"));
		vehicleRepository.save(new Vehicle("TIE Fighter", "Starfighter", "Imperial", "Laser Cannons"));
		vehicleRepository.save(new Vehicle("Star Destroyer", "Carrier", "Imperial", "Turbolaser Batteries and Ion Cannons"));
	}
}
