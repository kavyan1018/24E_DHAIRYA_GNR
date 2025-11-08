package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {

	public static void main(String[] args) {
		
		
//		Pattern pattern = Pattern.compile("\\d+");
		//Pattern pattern = Pattern.compile("\\D+");
		//Pattern pattern = Pattern.compile("\\S*");
		//Pattern pattern = Pattern.compile("\\w+");
		Pattern pattern = Pattern.compile("\\W+");
		Matcher matcher = pattern.matcher("#*%");
		System.out.println(matcher.matches());
		
		
	}
}
