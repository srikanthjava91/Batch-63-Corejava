package com.loops;

import java.util.Scanner;

// WAP Fibonacci series for first 10 numbers ..?  
// Fibonacci series : 0 1 1 2 3 5 8 13 21 
public class TestLPDemo7 {

	static void printFibbonacci(int num) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.print(n1 + " " + n2 + " ");
		for (int i = 1; i <= num; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbr to print Fibbonacci series  : ");
		int num = sc.nextInt();
		printFibbonacci(num);
		sc.close();
	}

}
