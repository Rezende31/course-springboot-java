package com.udemy.course.services.exceptions;

public class DatabaseException extends RuntimeException {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg) {
		super(msg);
	}
	
	
}
