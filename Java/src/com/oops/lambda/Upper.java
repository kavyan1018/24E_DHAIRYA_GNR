package com.oops.lambda;

interface Convert {

	String toUpperCase(String name);

}

public class Upper {

	public static void main(String[] args) {

		Convert c = (str) -> {

			return str.toUpperCase();
		};

		System.out.println(c.toUpperCase("raj"));
	}

}
