package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {

	public void getAllProducts() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("product.txt"));
			String data = "";

			while ((data = reader.readLine()) != null) {
				System.out.println(data);

			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addProduct() {

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("product.txt", true));
			for (int i = 1; i <= 3; i++) {
				System.out.println("Enter product Name:");
				Scanner sc = new Scanner(System.in);
				String pName = sc.nextLine(); // Use nextLine to capture the entire line

				System.out.println("Enter product price:");
				int pPrice = sc.nextInt();

				System.out.println("Enter product Qty :");
				int pQty = sc.nextInt();

				// Convert pPrice to String and write both product name and price
				writer.write(pName + "," + pPrice + "," + pQty);
				writer.newLine(); // Add a newline character to separate entries
				System.out.println("Added successfully");
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close(); // Close the writer to flush changes to the file
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteProduct() {
        try {
            File inputFile = new File("product.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuffer buffer = new StringBuffer();

            System.out.println("Enter product name to delete:");
            Scanner sc = new Scanner(System.in);
            String deleteProductName = sc.next();

            String data;
            while ((data = reader.readLine()) != null) {
                if (!data.contains(deleteProductName)) {
                    buffer.append(data);
                    buffer.append(System.lineSeparator());
                }
            }

            // Close the reader
            reader.close();

            // 
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
                writer.write(buffer.toString());
            }

            System.out.println("Product deleted successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		Task t = new Task();
		// t.addProduct();
		// t.getAllProducts();
		//t.deleteProduct();
	}
}
