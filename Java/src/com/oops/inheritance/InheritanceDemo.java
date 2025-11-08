package com.oops.inheritance;
// extends

class Parent {

	int prop = 40000000;
	
	void getOut() {
		
		System.out.println("getout....");
	}

}

public class InheritanceDemo extends Parent {
	
	void test() {
		
		System.out.println(prop);
		getOut();
	}

	public static void main(String[] args) {

	
		InheritanceDemo inheritanceDemo = new InheritanceDemo();
		inheritanceDemo.test();
		inheritanceDemo.getOut();
		//getOut();
		
	}
}
