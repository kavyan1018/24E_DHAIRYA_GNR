package com.oops.constructor;

class Ratan {

	public Ratan(String str) {
		
		System.out.println("ratan class param const called..." + str);
	}

}

public class Tata extends Ratan {

	public Tata(String str) {
		// super("hello");

		super(str);
		System.out.println("tata param called..." + str);
	}

	public static void main(String[] args) {

		Tata t = new Tata("jamsed");

	}
}
