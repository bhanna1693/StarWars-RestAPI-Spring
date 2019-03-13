package com.brianhanna.starwarsrestapi.characters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Character {
	
	// fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	private boolean isGood;
	private String weapon;
	
	// Empty Constructor for JPA
	public Character() {}
	
	// Constructor
	public Character(String firstName, String lastName, boolean isGood, String weapon) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isGood = isGood;
		this.weapon = weapon;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Character [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", isGood=" + isGood
				+ ", weapon=" + weapon + "]";
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
