package com.shopapp.exception;

public class UserNotFoundException extends Exception {
	public UserNotFoundException(String message) {
		super(message);
	}
}