package com.thread;

public class ThreadDemo3 extends Thread {

	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			
			System.out.println(i + " "+Thread.currentThread().getName() + "  is running.." );
		}
	}
	public static void main(String[] args) {
		
		
		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();
		
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		
		
		
	}
}
