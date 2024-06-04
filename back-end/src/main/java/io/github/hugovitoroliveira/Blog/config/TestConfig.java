package io.github.hugovitoroliveira.Blog.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.hugovitoroliveira.Blog.entities.User;
import io.github.hugovitoroliveira.Blog.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		User user1 = new User(null, "Marciano", "vermelho@marte.com.mr", "hum@noBurr0123");
//		User user2 = new User(null, "Humano", "azul@terra.com.tr", "OceanoÉtop123");
//		
//		userRepository.saveAll(Arrays.asList(user1, user2));
//		
	}
	
}
