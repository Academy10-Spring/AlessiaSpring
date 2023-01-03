package it.alessia.sito.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.alessia.sito.model.User;
import it.alessia.sito.repository.UserRepository;

@RestController
@RequestMapping("api")
public class ApiController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(value = "/addUser")
	public boolean addUser (@RequestParam Map<String, String> params) {
		try {
			User user = new User (params.get("nome"), params.get("cognome"));
			return true;
		}catch (NumberFormatException e){
			e.printStackTrace();
		}
		
		return false;
	}

}
