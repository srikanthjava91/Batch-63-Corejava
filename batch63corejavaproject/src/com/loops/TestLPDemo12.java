package com.loops;

import java.util.Scanner;

//NOte : Whenever we are working with numbers, 
//we must need to get reminder maximum times.
//Reminder will give the last digit of a given number.
//Quotient will give the first digits.

//WAP to find Sum of the digits of a Given number.
//input : 123 
//output : 6 

//input : 3456
//output : 18
public class TestLPDemo12 {

	// n= 123
	static int findDigitSum(int n) {
		int sum = 0;
		int r = 0;

		while (n > 0) {// 123!=0
			r = n % 10;// 123%10 --> 3,12%10--> 2, 1%10 --> 1
			n = n / 10;// 123/10 --> 12,12/10--> 1. 1/10 --> 0
			sum = sum + r;
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();

		int sumOfDigits = findDigitSum(num);
		System.out.println("Sum of all the digis from a Given number is  :" + sumOfDigits);

		System.out.println("main method ended !");
	}

}
