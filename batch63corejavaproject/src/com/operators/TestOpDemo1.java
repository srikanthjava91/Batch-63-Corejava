package com.operators;

import java.util.Scanner;

//Arithmetic Operators
//+ - * % /
public class TestOpDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number ");
		int a1 = sc.nextInt();
		System.out.println("enter another number ");
		int a2 = sc.nextInt();

		// BODMAS
		System.out.println("sum of two numbers :" + (a1 + a2));// + --> addition
		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("Difference of Two numbers " + a1-a2);
		System.out.println("Difference of Two numbers :" + (a1 - a2));// - --> subtraction
		System.out.println("Product of two numbers : " + a1 * a2);// * --> Multiplication
		System.out.println("Reminder of two numbers : " + a1 % a2);// % --> modulus
		System.out.println("Quotient of two numbers : " + a1 / a2);// / --> Division
	}

}
