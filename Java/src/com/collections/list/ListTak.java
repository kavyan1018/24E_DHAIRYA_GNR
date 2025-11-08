package com.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTak {

	public static List<String> users = new ArrayList<String>();

	public void addElm() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("enter user name");
			String name = sc.next();
			users.add(name);
			System.out.println("want to add more press 1 for yes !");
			int flag = sc.nextInt();

			if (flag != 1) {

				break;
			}

		}
	}

	public void display() {

		System.out.println(users);
	}

	public static void main(String[] args) {

		ListTak task = new ListTak();

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter 1 for add elemet");
			System.out.println("Enter 2 for delete :");
			System.out.println("Enter 3 for list: ");
			System.out.println("Enter 4 for exit..");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				task.addElm();
				break;
			case 2:

				break;
			case 3:
				task.display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		}

	}

}
