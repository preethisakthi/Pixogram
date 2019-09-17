package com.example.Microservice.UserService;

import java.util.stream.Stream;


import javax.annotation.Resource;
import javax.print.attribute.standard.Media;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



@EnableEurekaClient
@SpringBootApplication
public class UserServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}



}
