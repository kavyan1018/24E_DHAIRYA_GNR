package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your choice :");

		File file = null;

		System.out.println("press 1 for create file :");
		System.out.println("prrss 2 for create new folder...");
		System.out.println("press 3 for create many folders");
		System.out.println("press 4 for check file / folder is exist or not...");
		System.out.println("press 5 for check url is file or folder");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("please enter file name to create...");
			String fName = sc.next();
			file = new File(fName);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("please enter folder name to create");
			String folName = sc.next();
			file = new File("src/com/" + folName);
			// file = new File("x/y/z");
			boolean flag = file.mkdir();
			System.out.println(flag);
			System.out.println("folder created...");
			break;
		case 3:
			file = new File("a/b/c/d/e");
			file.mkdirs();
			break;
		case 4:
			file = new File("src");
			if (file.exists()) {

				System.out.println("file exist..");
			} else {

				System.out.println("not exist..");
			}
			break;

		case 5:
			file = new File("src");
			if (file.isFile()) {
				System.out.println("it is file..");
			} else {
				System.out.println("its not file..");
			}
			break;

		case 6:
			file = new File("demo.txt");
			if (file.isDirectory()) {

				System.out.println("its folder..");
			} else {

				System.out.println("not a folder..");
			}
			break;
		case 7:
			System.out.println("enter file name delete...");
			String dfname = sc.next();
			file = new File(dfname);
			if (file.exists()) {

				// file.deleteOnExit();
				if (file.delete()) {

					System.out.println(dfname + "  file deleted..");
				} else {
					System.out.println("file not deleted....");
				}

			} else {
				System.out.println("nothing to delete...");
			}

			break;
		}

	}
}
