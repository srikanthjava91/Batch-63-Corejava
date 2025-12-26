package com.loops;

import java.util.Scanner;

public class TestLPDemo17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String yn = "";

		do {
			System.out.println("Enter a number ");
			int a = sc.nextInt();

			System.out.println("Enter b number ");
			int b = sc.nextInt();

			System.out.println("ENter a symbol like + - * % /: ");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println(a + b);
			case "-" -> System.out.println(a - b);
			case "*" -> System.out.println(a * b);
			case "/" -> System.out.println(a / b);
			case "%" -> System.out.println(a % b);
			default -> System.out.println("Invalid entry !");
			}

			System.out.println("DO you want to continue, click Y for yes, N for No ? ");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

	}

}
