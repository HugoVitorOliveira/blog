package io.github.hugovitoroliveira.Blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.hugovitoroliveira.Blog.entities.User;
import io.github.hugovitoroliveira.Blog.repositories.UserRepository;

@Service
public class UserService{
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	};
}
