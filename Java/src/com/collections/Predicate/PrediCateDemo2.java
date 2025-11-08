package com.collections.Predicate;

import java.util.function.Predicate;

public class PrediCateDemo2 {

	public static boolean check(Predicate<String> predicate, String param) {
		return predicate.test(param);
	}

	public static void main(String[] args) {

		
		Predicate<String> p  = x->x.length()>4;
		Predicate<String> p1 = x->x.startsWith("a") && x.contains("m");
		System.out.println(check(p, "ram"));
		System.out.println(check(p1, "amit"));
		
		
	}
}
