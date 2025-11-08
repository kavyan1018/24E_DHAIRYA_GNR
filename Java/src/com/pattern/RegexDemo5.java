package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {

	
	public static void main(String[] args) {
		
	
	Pattern pattern = Pattern.compile("\\w+\\.{1}com");
	Matcher matcher = pattern.matcher("raj_gmail.com");
	System.out.println(matcher.matches());
	}
	
	
}
