package io.github.hugovitoroliveira.Blog.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.hugovitoroliveira.Blog.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u1 = new User(1, "Hugo", "email@legal.com", "cocotinha123");
		
		return ResponseEntity.ok().body(u1);
	}
}
