package com.ch1;

public class MethodDemo2 {

	static int x =100;
	int y=200;
	//
	static void test() {
	
		System.out.println(x);
		//System.out.println(y); //error
		System.out.println("sattic method wor woa");
	}
	
	void test2() {
		System.out.println(x);
		System.out.println(y);
	}
	static int sub(int x,int y) {
		
		return x -y;
	}
	
	public static void main(String[] args) {

		
		MethodDemo2.test();
		MethodDemo2 m2 = new MethodDemo2();
		m2.test();
		
		int ans = MethodDemo2.sub(100, 200);
		System.out.println(ans);
		
	}
}
