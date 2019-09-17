package com.example.Microservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice.model.User;
import com.example.Microservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		System.out.println("Get all Users...");
		return userService.getUsers();
	}

	@PostMapping(path = "/user/create")
	public User createUser(@RequestBody User user) {
		System.out.println("Creating User");
		User _user = userService.createUser(user);
		return _user;
	}

	@GetMapping(path = "/user/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId) {
		System.out.println("Get user with id " + userId);
		return userService.getUserById(userId);
	}


}
