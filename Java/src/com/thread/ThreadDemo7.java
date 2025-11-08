package com.thread;

class Table1 {

	public synchronized void printTable(int no) {

		
		for (int i = 1; i <= 10; i++) {

			System.out.println(no + " * " + i + " = " + (no * i));
		}

	}

}

class Thread11 extends Thread {

	Table1 t1;

	public Thread11(Table1 t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.printTable(100);
	}

}

class Thread22 extends Thread {

	Table1 t1;

	public Thread22(Table1 t1) {

		this.t1 = t1;
	}

	@Override
	public void run() {

		t1.printTable(50);
	}

}

public class ThreadDemo7 {
	
	
	public static void main(String[] args) {
		
		Table1 table1 = new Table1();
		Thread11 t1 = new Thread11(table1);
		Thread22 t2 = new Thread22(table1);
		
		t1.start();
		t2.start();
		
	}
	
	
	

}
