package com.exceptionhandling;

import java.util.InputMismatchException;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {
			int a[] = { 12, 23 };
			String str = "java";

			System.out.println(a[3]);
			System.out.println(str.charAt(5));

		} catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {

			System.out.println("please check len..");

		}

	}
}
