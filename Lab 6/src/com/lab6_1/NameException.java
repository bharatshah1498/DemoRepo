package com.lab6_1;

public class NameException extends Exception {
	
	private String message;

	public NameException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Error -> "+message;
	}

}
