package com.loops;

import java.util.Scanner;

//WAP to find Factorial of given number using for loop..? 
//input : 4! --> 4*3*2*1
//output : 24 
public class TestLPDemo8 {

	public static void main(String[] args) {
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of a given number is : " + fact);
		sc.close();
	}

}
