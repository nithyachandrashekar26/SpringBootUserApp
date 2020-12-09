package com.springboot.exercise.user.client;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserDetailsService {
	
	private final RestTemplate restTemplate;

	  public UserDetailsService(RestTemplate rest) {
	  this.restTemplate = rest;
	  }

//	  @HystrixCommand(fallbackMethod = "reliable")
	  public String getUserList() {
	  URI uri = URI.create("http://localhost:8080/api/userdetails");

	  return this.restTemplate.getForObject(uri, String.class);
	  }

	  public String reliable() {
	  return "User details unavailable at the moment";
	  }

}
