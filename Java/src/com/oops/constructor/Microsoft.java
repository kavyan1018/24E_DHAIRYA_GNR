package com.oops.constructor;

class Bill {

	// only param...

	public Bill(int salary) {

		System.out.println("bill salary =" + salary);
	}
	public Bill() {
		System.out.println("default of billl...");
	}
}

public class Microsoft extends Bill {

	public Microsoft() {
		super(1);
		System.out.println("mmicrosoft....");
	}

	public static void main(String[] args) {

		Microsoft m = new Microsoft();
	}
}
