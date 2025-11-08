package com.io.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerRead {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Samir\\Desktop\\ms.txt");
		try {
			Scanner sc = new Scanner(file);
			int count =0;
			long startTime = System.nanoTime();
			while (sc.hasNext()) {

//				System.out.println(sc.next());
				System.out.println(sc.nextLine());
				count++;
			}
			
			long endTime = System.nanoTime();
			System.out.println("total time = " + (endTime - startTime) / 1000000000);
			System.out.println(count);

		} catch (FileNotFoundException e) {
			System.out.println("file not found....");
		}

	}
}
