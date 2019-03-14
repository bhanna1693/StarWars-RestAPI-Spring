package com.brianhanna.starwarsrestapi.characters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/starwarsapi")
public class CharacterController {
	
	@Autowired
	private CharacterRepository characterRepository;
	
	@RequestMapping("/characters")
	public Iterable<Character> getCharacters() {
		return characterRepository.findAll();
	}
	
	@RequestMapping("/characters/name")
	public List<Character> findByName(@RequestParam String firstName, @RequestParam String lastName) {
		String fName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		String lName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		List<Character> result = characterRepository.findByFirstNameAndLastName(fName, lName);
		return result;
	}
}
