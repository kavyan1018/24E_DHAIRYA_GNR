package com.thread;

public class ThreadDemo5 {

	
	public static void main(String[] args) {
		
		
		
		Runnable r1 = () ->{
			
			//run...
			System.out.println("Thread is running....");
			
		};
		r1.run();
		
		Runnable r2 = ()->{
			
			System.out.println("Thread is running....");
		};
		r2.run();
		
	}
}
