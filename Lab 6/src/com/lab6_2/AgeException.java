package com.lab6_2;

public class AgeException extends Exception {
	
	private String message;

	public AgeException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Error -> "+message;
	}
}
