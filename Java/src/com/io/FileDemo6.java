package com.io;

import java.io.File;
import java.util.Scanner;

public class FileDemo6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name to delte without .txt");
		String fname = sc.next();
		fname = fname.concat(".txt");
		File file = new File("D:\\files\\"+fname);
		
		if(file.exists()) {
			
			if(file.delete()) {
				
				System.out.println(fname +" is deleted...");
			}
			else
			{
				System.out.println(fname +" is Not deleted...");
				
			}
		}
		else {
			
			System.out.println(fname+" is not exist..");
		}
		

	}
}
