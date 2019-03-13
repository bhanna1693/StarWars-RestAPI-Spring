package com.brianhanna.starwarsrestapi.vehicles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	// fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String vehicleType;
	private String alignment;
	private String weapon;
	
	// Empty Constructor for JPA
	public Vehicle() {}

	// toString method
	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", name=" + name + ", vehicleType=" + vehicleType + ", alignment=" + alignment
				+ ", weapon=" + weapon + "]";
	}

	// Constructor
	public Vehicle(String name, String vehicleType, String alignment, String weapon) {
		this.name = name;
		this.vehicleType = vehicleType;
		this.alignment = alignment;
		this.weapon = weapon;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
