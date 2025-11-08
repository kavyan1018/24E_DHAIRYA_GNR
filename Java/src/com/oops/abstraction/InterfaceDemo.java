package com.oops.abstraction;

interface Charge {

	void voltage();

	void test();
}

interface Remote extends Charge {

}

interface TV {

	void color();

	void test();

}

class InterfaceDemo implements Remote, TV {

	public void voltage() {
		// TODO Auto-generated method stub

		System.out.println("voltage..");
	}

	public static void main(String[] args) {

		
		Remote r = new InterfaceDemo();
		r.voltage();
		TV t = new InterfaceDemo();
		t.color();
		r.test();
		t.test();

		
		InterfaceDemo i = new InterfaceDemo();
		i.test();
	}

	public void color() {

		System.out.println("color");

	}

	public void test() {
		
		System.out.println("test called....");
		
	}
}
