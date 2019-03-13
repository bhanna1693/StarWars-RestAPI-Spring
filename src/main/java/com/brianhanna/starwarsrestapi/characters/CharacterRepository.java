package com.brianhanna.starwarsrestapi.characters;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

	List<Character> findByFirstNameAndLastName(String firstName, String lastName);
	
}
