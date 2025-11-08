package com.oops.abstraction;

interface Phone {

	// public final static int x =10;
	int x = 10;
	// fully abstract class
	// public actract..

	// public abstract ...

	void calling();
}

public class Mobile implements Phone {

	//int x = 100;

	public void calling() {

		int x = 200;
		System.out.println("Mobile class ...calling...");
		System.out.println(Phone.x);
		System.out.println(x);

	}

	public static void main(String[] args) {

		// Phone p = new Phone();
		Phone p = new Mobile();
		p.calling();
	}

}
