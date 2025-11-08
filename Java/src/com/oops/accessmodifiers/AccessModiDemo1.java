package com.oops.accessmodifiers;

public class AccessModiDemo1 {

	private int x = 10; //instance non static
	int y =20;
	protected int p =200;
	public int p1 = 100;
	//int y2;
	
	private void demo() {
		
		System.out.println("private method of modifier class...");
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(p1);
		
	}
	
	public static void main(String[] args) {
		
		
		AccessModiDemo1 a = new AccessModiDemo1();
		a.demo();
		a.y=20;
		a.p=250;
		
	}
}
