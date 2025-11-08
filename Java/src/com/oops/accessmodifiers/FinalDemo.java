package com.oops.accessmodifiers;

final class FinalClass{
	
	//we can not inherit final class...
}
public class FinalDemo {

	
	//const
	public final int x=20;
	
	//we can not override it...
	public final void demo() {
		System.out.println("final method....");
	}
	
	void test() {
		
		System.out.println(x);
	//	x =200; error can not reassign....
	}
	public static void main(String[] args) {
	
		
		
	}
}
