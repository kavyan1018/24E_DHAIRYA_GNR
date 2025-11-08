package com.oops.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[] { 10, 20, 30 };
		System.out.println(a.length);

//		int x[];
//		x = new int[10];
		int x[] = new int[10];
//		x[0] = 100;
//		x[0] = 100;
//		x[0] = 100;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter elements of an array : ");
		for (int i = 0; i < x.length; i++) {
			System.out.println("enter " + (i + 1) + " element... ");
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < x.length; i++) {

			System.out.println(" elm =" + x[i]);

		}

	}
}
