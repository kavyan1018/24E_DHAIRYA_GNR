package com.exceptionhandling;

class InvalidArrayException extends Exception {

	public InvalidArrayException(String msg) {

		super(msg);
	}
}

public class ExceptionDemo7 {

	public static void checkArray() throws InvalidArrayException {

		int a[] = new int[] { 10, 20, 30 ,0};
		for (int i : a) {
			if (i == 0) {
				throw new InvalidArrayException("0 is not allow in array...");
			}

		}
		for (int i : a) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		try {
			checkArray();
		} catch (InvalidArrayException e) {

			System.out.println(e.getMessage());
		}

	}
}
