package com.io;

import java.io.File;

public class FileDemo5 {

	
	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\Samir\\Desktop\\ac.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		
		
	}
}
