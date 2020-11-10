package com.lab6_3.cg.eis.exception;

public class EmployeeException extends Exception {
	
	private String message;

	public EmployeeException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Error -> "+message;
	}

}
