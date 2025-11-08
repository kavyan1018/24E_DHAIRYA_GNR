package com.thread;

class Calling {

	public synchronized void currentCall(int flag) {
		System.out.println("current call is running...");
		System.out.println("new call is on wait...");

		if (flag == 1) {

			try {
				System.out.println("current call is putting on hold...");
				wait(); // wait belongs to object class
				System.out.println("holded call received...");
				System.out.println("holded call end...");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public synchronized void newCall() {

		System.out.println("new call received...");
		System.out.println("new call is goinon...");
		System.out.println("new call is about to end...");
		System.out.println("new call ended and notifying to holded call..");
		notify();

	}

}

class Call1 extends Thread {

	Calling c;

	public Call1(Calling c) {

		this.c = c;
	}

	public void run() {

		c.currentCall(1);
	}
}

class Call2 extends Thread {

	Calling c;

	public Call2(Calling c) {
		this.c = c;
	}

	public void run() {

		c.newCall();
	}

}

public class ThreadCommunication {

	public static void main(String[] args) {

		Calling c1 = new Calling();
		Call1 call1 = new Call1(c1);
		Call2 call2 = new Call2(c1);
		call1.start();
		call2.start();

	}
}
