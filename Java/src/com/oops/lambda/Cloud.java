package com.oops.lambda;

//lambda demo 1 without return type without argument
//functionalINterface
@FunctionalInterface
interface Rain {

	public abstract void raining();
	// public abstract void raining1();
	// public abstract void raining1();
	// void rainging();
}

public class Cloud {

	public static void main(String[] args) {

		Rain r = () -> {
			System.out.println("raining call.....");
		};
		r.raining();
	}
}
