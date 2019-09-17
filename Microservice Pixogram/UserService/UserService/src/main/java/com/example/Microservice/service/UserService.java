package com.example.Microservice.service;

import java.util.List;
import java.util.Optional;

import com.example.Microservice.model.User;


public interface UserService {

	public List<com.example.Microservice.model.User> getUsers();
	
	public User createUser(User user);
	
	public Optional<User> getUserById(Long userId);
}
