package com.exceptionhandling;

import java.util.Scanner;

import com.util.ValidationUtil;

public class ExcpetionDemo5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name...");
		String name = sc.next();
		System.out.println("enter email..");
		String email = sc.next();
				
		//if else...
		try {
			
			if(ValidationUtil.checkStirng(name)) {
				System.out.println("valid.."+name);
			}
			if(ValidationUtil.checkStirng(email)) {
				System.out.println("valid.."+email);
			}
		} catch (InvalidStringException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
