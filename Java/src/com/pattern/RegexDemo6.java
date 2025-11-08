package com.pattern;

public class RegexDemo6 {

	public static void main(String[] args) {

		String str = "hi this is java\nok";
		
		String ss[] = str.split("\\s");
		for(String s:ss) {
			
			System.out.println(s);
		}
		
	}
}
