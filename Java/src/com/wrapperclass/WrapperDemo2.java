package com.wrapperclass;

public class WrapperDemo2 {

	public static void main(String[] args) {
		
		
		Integer i = new Integer(1000);
		Integer n1 = new Integer("200");
		System.out.println(i);
		System.out.println(n1+200);
		
		Float f = new Float(100.20);
		System.out.println(f);
		Float f1 = new Float("100.90");
		System.out.println(f1+1.10);
		System.out.println(f1);
	}
}
