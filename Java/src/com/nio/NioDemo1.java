package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo1 {

	public static void main(String[] args) {

		// non blocking io
		// Path interface..
		// Paths class
		// Files class

		Path path = Paths.get("demo.txt");
		try {
			
			if(Files.exists(path)) {
				
				System.out.println("file already exsits...");
			}
			else {
				
				Files.createFile(path);
				System.out.println("file created...");

			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Path path1 = Paths.get("r/s/t/u");
		try {
			//Files.createDirectory(path1);
			Files.createDirectories(path1);
			System.out.println("folder creaetd...");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}
