package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		
		Pattern p = Pattern.compile("..s"); //last s band before s only 1 char...
		Matcher matcher = p.matcher("alx");
		boolean b = matcher.matches();
		System.out.println(b);
	}
}
