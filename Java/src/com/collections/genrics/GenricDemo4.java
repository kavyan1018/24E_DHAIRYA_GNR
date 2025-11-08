package com.collections.genrics;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo4 {

	public void demo(List<?> list) {
		
		for(Object s:list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		
		GenricDemo4 g1 = new GenricDemo4();
		List<String> l = new ArrayList<String>();
		l.add("amit");
		g1.demo(l);
		
	}
}
