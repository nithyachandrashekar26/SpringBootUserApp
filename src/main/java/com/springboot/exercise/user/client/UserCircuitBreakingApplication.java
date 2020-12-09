package com.springboot.exercise.user.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.client.RestTemplate;

//@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class UserCircuitBreakingApplication {

  @Autowired
  private UserDetailsService service;

  @Bean
  public RestTemplate rest(RestTemplateBuilder builder) {
  return builder.build();
  }

  @RequestMapping("/api/userdetails")
  public String getUserdetails() {
  return service.getUserList();
  }

  public static void main(String[] args) {
  SpringApplication.run(UserCircuitBreakingApplication.class, args);
  }
}