package com.methods;

import java.util.Scanner;

public class TestTypesOfMethods4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int num1 = sc.nextInt();

		System.out.println("Enter another number ");
		int num2 = sc.nextInt();
		multiplication(num1, num2);

		System.out.println("Enter your name : ");
		sc.nextLine();
		String name = sc.nextLine();
		getName(name);

		System.out.println("Enter gender info : ");
		char gen = sc.next().charAt(0);// Male
		getgenderInfo(gen);

		System.out.println("main method ended ");
	}

	static void getgenderInfo(char c) {
		System.out.println("Gender : " + c);
	}

	static void getName(String name) {
		System.out.println("Name of the person : " + name);
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication method called ");
		System.out.println(a * b);
	}
}
