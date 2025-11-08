package com.oops.array;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 20;
		a[2] = 55;
		a[3] = 5;
		a[4] = 47;

		// Arrays.sort(a);
		int intKey = 55;

		int foundindex = Arrays.binarySearch(a, intKey);
		System.out.println(foundindex);

//		for (int i = 0; i < a.length; i++) {
//
//			System.out.println(a[i]);
//		}
	}
}
