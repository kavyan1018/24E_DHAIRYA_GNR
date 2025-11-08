package com.ch1;

//method behavior
//function
//2 type udf method predefine...
// static or non static
//wr wa
//wor wa
//wr woa
//wor woa
public class MethodDemo1 {
	
	//signature  accessmodifiers non accessmodiferes return type name of function(param)
	
	void test() {
		
		System.out.println("non static woa wor");
	}
	
	int sum(int x,int y) {
		
		System.out.println("with arg and with return type...");
		int c =  x + y;
		//return c;
		return x + y;
		//return 100;
	}
	
	float average(float x, float y,float z) {
		
		return (x + y + z) /3;
	}
	
	void demo(double x) {
		
		System.out.println("value of x = "+x);
	}

	public static void main(String[] args) {
		//if you need to call tetst method it can be called using object only...
		
		MethodDemo1 m1 = new MethodDemo1();
		m1.test();
		//call by value,,
		int ans = m1.sum(100, 200);
		System.out.println("ans = "+ans);
		
		
		float ans1 = m1.average(12.2f, 22.2f, 33.3f);
		System.out.println("ans 1 = "+ans1); //22.266666 22.26
	
		m1.demo(100.11);
		
		
		
		
		
	}
}
