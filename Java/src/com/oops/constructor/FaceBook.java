package com.oops.constructor;

public class FaceBook {

	String userName;
	
	public FaceBook(String userName) {
	
		this.userName = userName;
	}
	
	public void profile() {
		
		System.out.println(userName);
	}
	
	public static void main(String[] args) {
		
		FaceBook u1 = new FaceBook("raj");
		FaceBook u2 = new FaceBook("ram");
		FaceBook u3 = new FaceBook("parth");
		//u1.userName = "ram";
		u1.profile();
		u2.profile();
		u3.profile();
		
		
	}
}
