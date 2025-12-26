package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();

		try {
			System.out.println(a / b);
			return;
		} catch (ArithmeticException e) {
			System.err.println("Dont enter Zero's to proceed ");
//			e.printStackTrace();
//			System.err.println(e.getMessage());
//			System.err.println(e.toString());
		}

		System.out.println("Hello Guys, Welcome to Exception Handling !");
		System.out.println("main method ended !");
	}
}
