package com.oops.inheritance;

class Demo1{
	
	int x =100;
	void getData() {
		
		System.out.println("get data...");
	}
	
}
class Demo2 extends Demo1{
	
	
	int p =200;
	void myData() {
		
		System.out.println("my data"+ x);
		
	}
}

class Demo3 extends Demo2{
	
	
	void yourData() {	
		System.out.println("your Data " + x + " "+ p);
	}
}



public class MultiLevel {

	public static void main(String[] args) {
		
		Demo3 d3 = new Demo3();
		d3.yourData();
		d3.myData();
		d3.getData();
		
		Demo2 d2 = new Demo2();
		d2.myData();
		d2.getData();
		
		
	}
}
