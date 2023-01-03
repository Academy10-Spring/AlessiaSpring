package it.alessia.sito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.alessia.sito.model.User;
import it.alessia.sito.repository.UserRepository;

@Controller
public class WebController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	private String getHome(Model model) {
		
		List <User> UserList = (List<User>) userRepository.findAll();
		model.addAttribute("User", UserList);
		return "home";
	}
}
