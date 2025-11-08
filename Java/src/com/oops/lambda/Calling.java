package com.oops.lambda;

interface Calls {

	// interfcae public...
	// public abstract void call()
	void call();
}

public class Calling implements Calls {

	public void call() {
		System.out.println("calling call method....");
	}

	public static void main(String[] args) {

		Calls c = new Calling();
		c.call();

	}

}
