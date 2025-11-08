package com.oops.poly.overriding;

class Continent {

	public void nato() {

		System.out.println("contentinet nato method called....");
		// return 0;
	}

	protected int unesco() {
		System.out.println("unescco called...");
		return 0;
	}

	String SCO() {

		System.out.println("sco method of continent caled...");
		return "SCO";
	}
	
	private void fund()
	{
		System.out.println("fund of continent...");
	}

}

public class Country extends Continent {

	public void nato() {

		System.out.println("country... nato method called....");
	}

	public int unesco() {

		return 10;
	}

	public static void main(String[] args) {

		Country c = new Country();
		c.nato();
	}

	String SCO() {

		System.out.println("sco method of country caled...");
		return "SCO CHINA";
	}
	
	int fund()
	{
		System.out.println("fund of continent...");
		return 0;
	}

}
