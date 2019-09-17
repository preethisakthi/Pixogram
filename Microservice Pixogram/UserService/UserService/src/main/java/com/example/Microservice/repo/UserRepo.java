package com.example.Microservice.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.Microservice.model.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
