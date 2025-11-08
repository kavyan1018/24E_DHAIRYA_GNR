package com.collections.Predicate;

import java.util.function.Predicate;

public class PredivateChaining {

	
	public static void main(String[] args) {
		
		
		Predicate<String> isValid = x->x.startsWith("a");
		Predicate<String> isCotain = x->x.contains("p");
		
		Predicate<String> combine = isValid.and(isCotain);
		System.out.println(combine.test("arit"));
		
		
		
		
		
		
		
	}
}
