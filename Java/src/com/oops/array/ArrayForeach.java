package com.oops.array;

public class ArrayForeach {

	public static void main(String[] args) {

		int x[] = new int[5];
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[4] = 500;

		for (int i : x) {
			System.out.println(i);
		}

//		for(int i=0;i<x.length;i++) {
//			System.out.println(x[i]);
//		}

	}
}
