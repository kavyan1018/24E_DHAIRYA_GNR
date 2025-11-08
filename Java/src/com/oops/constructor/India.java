package com.oops.constructor;

public class India {
	
	//instance variable n..
	int indepancyear =2000;

	//i = 1947
	//p = 0
	public India(int indepancyear) {

		System.out.println(indepancyear);
		this.indepancyear = indepancyear;
	}
	
	public void svp() {
		
		//instance vatiable...
		System.out.println("indepancyear = "+indepancyear);
	}

	public static void main(String[] args) {

		India i = new India(1947); //param
		India pak = new India(0); //pak
		India ban = new India(1971);
		
		i.svp();
		pak.svp();
		ban.svp();
	}
}
