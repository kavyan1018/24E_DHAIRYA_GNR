package com.oops.accessmodifiers;

public class SubClass extends AccessModiDemo1 {

	void test() {
		
		System.out.println(y);
		System.out.println(p);
		System.out.println(p1);
	}
	
	public static void main(String[] args) {
		
		AccessModiDemo1 a = new AccessModiDemo1();
		
//		a.demo(); //error  not visible
//		a.x;  //error not visible
	}
}
