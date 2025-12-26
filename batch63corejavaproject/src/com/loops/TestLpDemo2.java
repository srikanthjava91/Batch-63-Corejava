package com.loops;

//Q) WAP to print even numbers 0 to 100 
//and odd numbers 100 to 0.
public class TestLpDemo2 {

	static void printEvenOdd() {
		System.out.println("Even numbers: ");
		for (long i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("odd numbers: ");
		for (long i = 100; i >= 0; i--) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		printEvenOdd();

		System.out.println("main method ended !!");
	}
}
