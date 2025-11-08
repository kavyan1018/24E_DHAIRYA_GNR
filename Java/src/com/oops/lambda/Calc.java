package com.oops.lambda;

interface Calulator {

	int add(int a, int b);
}

public class Calc {

	public static void main(String[] args) {

		Calulator c = (a, b) -> {
			System.out.println("add method called...");
			return a + b;
		};
		
		int x = c.add(100, 200);
		System.out.println("add ="+x);
	}
}
