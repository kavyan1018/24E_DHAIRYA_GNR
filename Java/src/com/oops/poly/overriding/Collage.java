package com.oops.poly.overriding;

class UNI {

	public void campus() {

		System.out.println("UNI CAMPUS>...");
	}
	
	public void library() {
		
		System.out.println("librabry of UNI");
	}
}

public class Collage extends UNI {

	public void campus() {

		System.out.println("COLLAGE... CAMPUS>...");
	}
	
	public void canteen() {
		
		System.out.println("cantten of collage...");
	}
	
	public static void main(String[] args) {
		
		
		//refernce of parent classs and memory / object of child class
		//poly,,morephic object....
		UNI u = new Collage();
		u.campus();
		u.library();
		
		
		
	}

}
