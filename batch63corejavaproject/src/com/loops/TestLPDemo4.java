package com.loops;

import java.util.Scanner;

//WAP to find the Given number is perfect or not ..? 
//A perfect number is a positive integer that is equal to the sum of its positive proper divisors, 
//excluding the number itself. 
//For example, the number 6 has divisors 1, 2, and 3, and 1 + 2 + 3 = 6, 
//making it a perfect number. The first few perfect numbers are 6, 28, 496, and 8128.

public class TestLPDemo4 {

	static boolean isperfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;// 1 2 4 7 14
			}
		}
		return sum == n;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();// 6

		boolean status = isperfect(num);

		if (status) {
			System.out.println("The given number is perfect ");
		} else {
			System.out.println("The given number is not perfect ");
		}
		sc.close();
	}

}
