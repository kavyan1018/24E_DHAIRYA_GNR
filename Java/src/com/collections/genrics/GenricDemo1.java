package com.collections.genrics;

import java.util.List;
//type..
public class GenricDemo1<T> {

//	public void add(int x) {
//		System.out.println(x);
//
//	}
	
	public void add(T x) {
		
		System.out.println(x);
	}

	public static void main(String[] args) {

		GenricDemo1 g1 = new GenricDemo1();
		g1.add(100);
		g1.add("amit");
		g1.add(false);
		
		GenricDemo1<String> g2 = new GenricDemo1<String>();
		g2.add("amit");

	}
}
