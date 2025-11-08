package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		
		
		//Pattern pattern = Pattern.compile("[abc]+");
		//Pattern pattern = Pattern.compile("[0-9]{6}");
		//Pattern pattern = Pattern.compile("[6789]{1}[0-9]{9}");
		Pattern pattern = Pattern.compile("[A-Za-z]{4,8}");
		
		Matcher matcher = pattern.matcher("abcdefghijkl");
		System.out.println(matcher.matches());
				
		
		
	}
}
