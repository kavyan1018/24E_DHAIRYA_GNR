package com.thread;

class Table {

	//..method syncronized
	//syncronized block...
	public void printTable(int no) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(no + " * " + i + " = " + (no * i));
		}
	}

}

class Thread1 extends Thread {

	Table t1; // t1 is not object yet [new]

	public Thread1(Table t1) {

		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.printTable(5);
	}

}

class Thread2 extends Thread {

	Table t1;

	public Thread2(Table t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		t1.printTable(10);
	}

}

public class ThreadDemo6 {

	public static void main(String[] args) {

		Table t = new Table();

		Thread1 t1 = new Thread1(t);
		t1.start();

		Thread2 t2 = new Thread2(t);
		t2.start();

	}
}
