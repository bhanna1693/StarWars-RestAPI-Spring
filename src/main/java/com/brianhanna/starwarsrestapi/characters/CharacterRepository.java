package com.brianhanna.starwarsrestapi.characters;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

	List<Character> findByFirstNameAndLastName(String firstName, String lastName);
	
}
