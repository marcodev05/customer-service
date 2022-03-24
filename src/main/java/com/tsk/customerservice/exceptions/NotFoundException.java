package com.tsk.customerservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{

	public NotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}
