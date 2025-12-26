package com.logicalstatements;

import java.util.Scanner;

//WAP to calculate numbers using switch cases.
public class TestLSDemo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();
		int result = 0;

		System.out.println("Enter a symbol to proceed for calculation like + - * / %: ");
		String sym = sc.next();

		switch (sym) {
		case "+" -> {
			System.out.println("Addition of two value : ");
			result = a + b;
		}
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = a / b;
		case "%" -> result = a % b;
		default -> System.out.println("Invalid symbol to proceed !");
		}

		System.out.println("Result is : " + result);
		sc.close();
	}

}
