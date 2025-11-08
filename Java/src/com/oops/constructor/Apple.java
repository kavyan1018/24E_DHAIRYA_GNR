package com.oops.constructor;

class Steve{
	
	public Steve() {
		System.out.println("default cons of steve clss...");
	}
	
}


public class Apple extends Steve {

	public Apple() {
		
		System.out.println("apple class const called...");
	}
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		
		
	}
}
