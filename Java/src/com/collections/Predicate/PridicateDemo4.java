package com.collections.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PridicateDemo4 {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("ajay");
		list.add("amit");
		list.add("parth");
		
		Predicate<List<String>> predicate = x->x.size()>0;
		
		System.out.println(predicate.test(list));
		
		
		
		
	}
}
