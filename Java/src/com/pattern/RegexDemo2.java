package com.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		
		
		//Pattern pattern = Pattern.compile("[a-f[s-z][A-E]]");
		Pattern pattern = Pattern.compile("[a-z&&[^d-g]]");
		Matcher matcher  = pattern.matcher("z");
		System.out.println(matcher.matches());
	}
}
