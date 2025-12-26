package com.methods;

import java.util.Scanner;

public class TestTypesOfMethods6 {

	static double addition(double a, double b) {
		System.out.println("Addition with double ");
		return a + b;
	}

	static double addition(int a, int b) {
		System.out.println("Addition with int ");
		return a + b;
	}

	static double addition(int a, double b, short s, double d1) {
		return a + b + s + d1;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("Enter b value ");
		int b = sc.nextInt();

		// call by values
		System.out.println(addition(a, b));
		System.out.println("main method Ended !");

		// call by value
		short s = 30;
		System.out.println(addition(10, 20, s, 40));
	}

}
