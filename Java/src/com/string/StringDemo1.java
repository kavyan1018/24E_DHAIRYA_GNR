package com.string;

import java.util.Scanner;

public class StringDemo1 {

	public static void main(String[] args) {

		String s = "java";
		System.out.println(s);
		String s1 = new String("java");
		System.out.println(s1);

		s = s.concat("python");
		System.out.println(s);
	
		//System.out.println(s[0]);
//		System.out.println(s.charAt(0));
//		for(int i=0;i<s.length();i++) {
//			
//			System.out.println(s.charAt(i));
//		}
//
		
		int ind = s.indexOf('j');
		System.out.println(ind);
		ind = s.lastIndexOf('a');
		System.out.println(ind);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your name:");
		String name = sc.nextLine();
		System.out.println("name = "+name);
		
		
		
		
		
		
		

	}
}
