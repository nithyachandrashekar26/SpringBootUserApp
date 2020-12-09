package com.springboot.exercise.user.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.exercise.user.bo.User;

public interface UserDetailsRepository extends JpaRepository<User, Long> {

}
