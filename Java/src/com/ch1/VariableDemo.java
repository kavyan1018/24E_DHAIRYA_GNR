package com.ch1;

//file -->VaribleDemo
//1 java can have only 1 public class
//1 java file can have n class which is not public...
// main method should be in public class
// variable:variables are containers which can stores data..
public class VariableDemo {

	int x;   //instance variable, class level varible.. 
			//non static instance variable...
	//non static instance variable can not use inside static method.. [reason...??]
	//non static instance variable can use inside nont static method.. 
	
	static int y; 
	//static instance variable can  use inside static method.. [reason...??]
	//static instance variable can  use inside non static method also 
	
	void demo() {
	
		//local variable....
		//local variable must be init..... before use...
		//local variable can not be static 
		int p=10;
		//int q=100;
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(x);
		System.out.println(y);
		

	}

}
