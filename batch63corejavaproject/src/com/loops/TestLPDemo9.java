package com.loops;

import java.util.Scanner;

//WAP to find Factorial of given number using recursion..? 
public class TestLPDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		fact = findFact(n);
		System.out.println("Factorial of a given number : " + fact);

	}

	static int findFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * findFact(n - 1);
	}
}
