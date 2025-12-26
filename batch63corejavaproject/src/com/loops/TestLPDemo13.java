package com.loops;

import java.util.Scanner;

//WAP to print reverse of a given number.?
//WAP the given number is palindrome or not ..? 
//input : 456 
//output : 654 

//input : 675
//output : 576

//input : 121
//output : 121

public class TestLPDemo13 {

	static boolean isPalin(int an, int rn) {
		if (an == rn) {
			return true;
		} else {
			return false;
		}
	}

	// 4 5 6 --> 654
	static int findReverseNumber(int n) {
		int rev = 0;// 6 65 654
		int r = 0;

		while (n != 0) {
			r = n % 10;// 101%10 --> 1, 10%10 --> 0, 1%10--> 1
			n = n / 10;// 101/10 --> 10 --> 10/10 --> 1, 1/10 --> 0
			rev = rev * 10 + r;// 1 10 101
		}

		return rev;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();

		int reverseNumber = findReverseNumber(num);
		System.out.println("Reverse number of a given number : " + reverseNumber);
		boolean isPalin = isPalin(num, reverseNumber);

		if (isPalin) {
			System.out.println("The given number is Palindrome ");
		} else {
			System.out.println("The given number is not Palindrome ");
		}

		sc.close();
	}
}
