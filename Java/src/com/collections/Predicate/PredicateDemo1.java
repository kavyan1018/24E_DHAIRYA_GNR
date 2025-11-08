package com.collections.Predicate;
//interface...

import java.util.function.Predicate;

public class PredicateDemo1 {
	
	public static void main(String[] args) {

		Predicate<Integer> isEligible = x->x>18;
		System.out.println(isEligible.test(19));
		
		Predicate<String> isValid = x->x.startsWith("a");
		System.out.println(isValid.test("mit"));
		
		
		
	}
}
