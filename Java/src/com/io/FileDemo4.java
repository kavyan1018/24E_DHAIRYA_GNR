package com.io;

import java.io.File;

public class FileDemo4 {

	public static void main(String[] args) {

		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");

		File files[] = file.listFiles();

		for (File f : files) {

			if(f.isFile()) {
				System.out.println("FILE :- "+f);
			}
			else {
				System.out.println("FOLDER :-"+f);
			}
		}
		
		String files1[] = file.list();
		
//		for(String s:files1) {
//			
//			System.out.println(s);
//		}
		

	}
}
