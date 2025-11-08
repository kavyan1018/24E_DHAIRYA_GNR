package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NioDemo2 {

	public static void main(String[] args) {

//		Path source = Paths.get("demo.txt");
//		Path dest = Paths.get("royal/demo.txt");
//
//		try {
//			Files.copy(source, dest);
//			System.out.println("file copied..");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file name to copy..."); // demo.txt

		String sourceFile = sc.next(); // demo.txt
		// Path source = Paths.get("demo.txt");
		Path source = Paths.get(sourceFile);

		if (Files.exists(source)) {

			Path destfolder = Paths.get("royal");
			if (Files.exists(destfolder)) { // if folder avaial;ble...

				System.out.println("folder is exsit...");
				Path path = Paths.get("royal\\" + sourceFile); // royal/demo.txt
				if (Files.exists(path)) {
					System.out.println("file already exist..");
				} else {

					try {
						//Files.copy(source, path);
						Files.move(source, path);
						System.out.println("file copy...");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else {

				System.out.println("dest folder is not exsit...");
			}

		} else {

			System.out.println("No file availble to copy");
		}

	}
}
