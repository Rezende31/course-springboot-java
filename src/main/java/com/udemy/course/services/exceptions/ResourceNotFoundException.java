package com.udemy.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * serial Version
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resurce not found. Id " + id);
	}

}
