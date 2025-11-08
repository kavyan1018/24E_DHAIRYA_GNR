package com.oops.constructor;

public class Kite {
	
	public Kite() {
		System.out.println("default cont of kite....");
	}
	public Kite(int price){
		
		System.out.println("param kite.."+price);
		
	}

	public static void main(String[] args) {
		
		Kite k1= new Kite(12);
		Kite k2 = new Kite();
		
	}
}
