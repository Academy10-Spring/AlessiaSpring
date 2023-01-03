package it.alessia.sito.bootstrapdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.alessia.sito.model.User;
import it.alessia.sito.repository.UserRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User userMario = new User ("Mario", "Rossi");
		User userGiorgio = new User ("Giorgio", "Bianchi");
		
		userRepository.save(userMario);
		userRepository.save(userGiorgio);
	}
	

}
