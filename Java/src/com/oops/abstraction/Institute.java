package com.oops.abstraction;

abstract class EDU {

	public abstract void rules();
}

abstract class Uni extends EDU {

	public abstract void enrolment();

	void fees() {

		System.out.println("fees of uni.....");
	}

	public void rules() {

	}

}

public class Institute extends Uni {

	public void enrolment() {

		System.out.println("enrolment of institute...");
	}

	public void fees() {
///

		super.fees();
		System.out.println("fees of institute");

	}

	public static void main(String[] args) {

		Uni u = new Institute();
		u.enrolment();
		u.fees();
	}

//	@Override
//	public void rules() {
//		// TODO Auto-generated method stub
//		
//	}

}
