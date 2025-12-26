package com.loops;

import java.util.Scanner;

//WAP to print factors of a given number ..?
//Factors of a number are defined as the integers 
//that can divide the number exactly, meaning there is no remainder.

//input : 6 --> 1 2 3 6 
//input : 9 --> 1 3 9 
//input : 24 --> 1 2 3 4 6 8 12 24 
//input : 28 --> 1 2 4 7 14 28 

public class TestLPDemo3 {

	static void findFactors(int n) {

		/// 10%1--> 1)10(10 --> r=0
		/// 10%2 --> 2)10(5 --> r=0
		/// 10%3 --> 3)10(3 --> r=1
		/// 10%4 --> 4)10(2 --> r=2
		/// 10%5 --> 5)10(2 --> r=0
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");// 1 2
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();// 6
		findFactors(num);
		System.out.println("main method ended !");
	}
}
