package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter No 1");
			int no1 = sc.nextInt();
			System.out.println("Enter No 2");
			int no2 = sc.nextInt();

			int ans = no1 / no2;

			System.out.println("ans = " + ans);
		}
//		catch(Exception e) {
//			System.out.println("Something went wrong..");
//		}

		// error..... unreachable code...

//		catch(RuntimeException e) {
//				
//		}

		catch (ArithmeticException e) {

			System.out.println("cannot divide by zero..");
			// e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {

			System.out.println("please enter digits only..");

		} catch (Exception e) {
			System.out.println("Something went wrong..");
		}

	}
}
