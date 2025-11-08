package com.wrapperclass;

public class WrapperDemo3 {

	public static void main(String[] args) {
		
		
		Integer a = new Integer("200");
		Integer b = 100;
		
		System.out.println(Integer.compare(a, b));
		System.out.println(Integer.max(a, b));
		System.out.println(Integer.valueOf(a));
		
	}
}
