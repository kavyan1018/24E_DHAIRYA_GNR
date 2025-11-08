package com.thread;

public class ThreadDemo4  implements Runnable{

	public static void main(String[] args) {
		
		ThreadDemo4 t = new ThreadDemo4(); //runnable target...
		
//		Thread t1 = new Thread(t);
//		Thread t2 = new Thread(t);
//		Thread t3 = new Thread(t);
//
		Thread t1 = new Thread(t, "A");
		Thread t2 = new Thread(t, "B");
		Thread t3 = new Thread(t, "C");
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() +" Thread is running");
		
	}
}
