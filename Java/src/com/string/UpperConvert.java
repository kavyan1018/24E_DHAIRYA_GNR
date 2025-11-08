package com.string;

import java.util.Scanner;

public class UpperConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();
		int lower=0;
		String lwr="";
		//amit
		//97
		
		for(int i=0;i<name.length();i++) {
			
			//aM
			if(name.charAt(i) >= 97 && name.charAt(i)<= 122) {
				
				//lower = 97 - 32 = 65
				lower = name.charAt(i)-32;
				//lwr = lwr +(char)65 A
				//lwr= "A"
				lwr =  lwr + (char) lower;	
			}
			else {
				lower = name.charAt(i);
				lwr = lwr +(char)lower;
			}
			
			
		}
		System.out.println(lwr);
		
	}
}
