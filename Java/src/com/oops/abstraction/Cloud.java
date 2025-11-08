package com.oops.abstraction;

interface Air {

	void quality();
}

abstract class Dust implements Air {

	public abstract void quality();
}

public class Cloud extends Dust {

	
	public void quality() {
	
		System.out.println("q...");
		
	}

	public static void main(String[] args) {
		
		Air a = new Cloud();
		a.quality();
		Dust d = new Cloud();
		d.quality();
	}
	
	

}
