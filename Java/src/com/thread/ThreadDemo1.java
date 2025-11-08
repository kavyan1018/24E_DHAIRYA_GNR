package com.thread;

public class ThreadDemo1 extends Thread {

	
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" Thread is running..."+Thread.currentThread().getName());
		}
	}
	
	
	
	public static void main(String[] args) {
			
		//create a thread...
		ThreadDemo1 t1 = new ThreadDemo1(); //1
		ThreadDemo1 t2 = new ThreadDemo1(); //2
		
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t2.start();
		
		
		
	}
}
