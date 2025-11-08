package com.exceptionhandling;

public class ExceptionDemo6 {

	public static void CheckString(String name) throws InvaliPalindrome {

		StringBuffer sb = new StringBuffer(name);
		String ss = sb.reverse().toString();

		if (ss.equals(name)) {

			throw new InvaliPalindrome("palindrom not allow...");
		}
		else {
			System.out.println(name + " works...");
		}

	}

	public static void main(String[] args) {

		try {
			CheckString("naman");
		} catch (InvaliPalindrome e) {
	
			System.out.println(e.getMessage());
		}
	}
}
