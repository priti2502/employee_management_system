package com.qsp.employee_management_system.exception;

public class PhoneNotFound extends RuntimeException {
private String message;
	
	public PhoneNotFound(String message) {
		// TODO Auto-generated constructor stub
		super();
		this.message=message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
