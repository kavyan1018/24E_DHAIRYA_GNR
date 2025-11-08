package com.thread;

public class ThreadDemo2 extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " thread is running" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		System.out.println("programme started...");
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();

		try {
			System.out.println("thred is going to sleep " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");

		t1.start();
		t2.start();
		t3.start();

	}
}
