package io.github.hugovitoroliveira.Blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.hugovitoroliveira.Blog.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
}
