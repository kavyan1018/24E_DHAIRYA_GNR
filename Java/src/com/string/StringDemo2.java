package com.string;

public class StringDemo2 {

	
	public static void main(String[] args) {
		
		
		String name = "Royal classes";
		
		boolean flag = name.contains("ya");
		System.out.println("contains "+flag);
		
		System.out.println("equals.."+name.equals("royal"));
		int diff = name.compareTo("Royal");
		//Royal.CompareTo("royal")
		System.out.println(diff);
		
		System.out.println("is empty..."+name.isEmpty());
		String data = "  hello  ";
		
		System.out.println("len of data"+data.length());
		System.out.println(data);
		data = data.trim();
		System.out.println("len of data after trim "+data.length());
		System.out.println(data);
		
		name = name.toUpperCase();
		System.out.println("upper..."+name);
		name = name.toLowerCase();
		System.out.println("lower"+name);
		
	}
}
