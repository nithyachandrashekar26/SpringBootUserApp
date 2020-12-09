package com.springboot.exercise.user.controller;


import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.executable.ValidateOnExecution;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exercise.user.bo.User;
import com.springboot.exercise.user.repo.UserDetailsRepository;
import com.springboot.exercise.user.exception.UserIdInvalidException;
import com.springboot.exercise.user.exception.UserNotFoundException;

@Validated
@RestController
public class UserDetailsController {

  private final UserDetailsRepository repository;

  public UserDetailsController(UserDetailsRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/api/userdetails")
  List<User> all() {
    return repository.findAll();
  }

   // Single item

  @GetMapping("/api/userdetails/{id}")
  @ValidateOnExecution
  User one(@Valid 
	        @Pattern(regexp="(0?[1-9]*)", message="Please query with a valid id") @PathVariable String id)  {		  
   Long empId = Long.valueOf(id);
   return repository.findById(empId)
      .orElseThrow(() -> new UserNotFoundException(empId));
	}
  

  @PutMapping("/api/userdetails/{id}")
  User updateUserdetails(@RequestBody User updatedUser, @PathVariable Long id) {
 
    return repository.findById(id)
      .map(user -> {    	 
    	  if (updatedUser.getTitle() != null) {
    		  user.setTitle(updatedUser.getTitle());
    	  }
    	  if (updatedUser.getFirstName() != null) {
    		  user.setFirstName(updatedUser.getFirstName());
    	  }
    	  if (updatedUser.getLastName() != null) {
    		  user.setLastName(updatedUser.getLastName());
    	  }
    	  if (updatedUser.getGender() != null) {
    		  user.setGender(updatedUser.getGender());
    	  }
    	  if (updatedUser.getAddress() != null) {
    		  user.setAddress(updatedUser.getAddress());    
    	  }
    	return repository.save(user);
      })
      .orElseThrow(() -> new UserNotFoundException(id));
  }
}
