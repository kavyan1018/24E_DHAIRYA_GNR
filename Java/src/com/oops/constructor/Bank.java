package com.oops.constructor;

public class Bank {

	// zero param cons
	int amount;

	public Bank() {
		// default constructor...
		amount = 0;
		System.out.println("default constructor created....");
	}

	public static void main(String[] args) {

		Bank b = new Bank();
	}
}
