package com.brianhanna.starwarsrestapi.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadDatabase implements CommandLineRunner {

	@Autowired
	CharacterRepository characterRepository;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		characterRepository.save(new Character("Luke", "Skywalker", true, "lightsaber"));
		characterRepository.save(new Character("Darth", "Vader", false, "lightsaber"));
		characterRepository.save(new Character("Han", "Solo", true, "DL-44"));
		characterRepository.save(new Character("Boba", "Fett", false, "EE-2"));
	}
}
