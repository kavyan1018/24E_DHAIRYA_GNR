package com.exceptionhandling;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String msg) {
		
		//exception class param const invoke....
		super(msg);
	}
}

public class ExcpetionDemo4 {
	
	
	public static void checkAge(int age) throws InvalidAgeException{
		if(age<18) {
			
			throw new InvalidAgeException("age is not valid !!");
		}
		else {
			System.out.println(age);
		}
		
		
	}

	public static void main(String[] args) throws InvalidAgeException {
		
		try {
			checkAge(15);
		} catch (InvalidAgeException e) {
//			System.out.println("age is not valid...");
			System.out.println(e.getMessage());
		}

		//checkAge(15);
	}
}
