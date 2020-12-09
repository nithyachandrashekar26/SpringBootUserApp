package com.springboot.exercise.user.exception;

public class UserIdInvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserIdInvalidException(Long id) {
    super("Invalid user id format " + id);
  }
}
