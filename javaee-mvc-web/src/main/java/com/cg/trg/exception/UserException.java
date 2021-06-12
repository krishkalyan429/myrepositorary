package com.cg.trg.exception;

//Custom checked exception
public class UserException extends Exception{

	public UserException() {

	}

	public UserException(String errMessage) {
		super(errMessage);
	}

	public UserException(String errMessage, Throwable t) {
		super(errMessage,t);
	}
}


