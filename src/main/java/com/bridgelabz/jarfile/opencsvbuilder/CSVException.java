package com.bridgelabz.jarfile.opencsvbuilder;

public class CSVException extends Exception {

	public enum ExceptionType {
		INCORRECT_STATE;
	}

	public ExceptionType type;

	public CSVException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
