package com.collections.genrics;

public class GenricDemo3 <T> {

	
	public T add(T a) {
		
		return a;
	}
	
	
	public static void main(String[] args) {
		
		GenricDemo3<String> g1 = new  GenricDemo3<String>();
		System.out.println(g1.add("ram"));
		
		
		
	}
	
}
