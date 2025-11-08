package com.io;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {

		File file = new File("src/com/io/");

		String abspath  = file.getAbsolutePath();
		System.out.println(abspath);
		
		//File file2 = new File("D:\workspaces\java\CLUB-6-JAVA\src\com\io")
		File file2 = file.getAbsoluteFile();
		System.out.println(file2);
		
		System.out.println(file2.isFile());
		System.out.println(file2.isDirectory());

	}
}
