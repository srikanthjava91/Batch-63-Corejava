package com.loops;

import java.util.Scanner;

//WAP to find the given number is Armstrong or not ..? 

//An Armstrong number (also known as a narcissistic number) is a number 
//that is equal to the "sum of its own digits raised to the power of 
//the number of digits." For example, 153 is an Armstrong number because:

//1
//0
//153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
//370 = 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370 
//371 = 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
//1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 +  1296+ 81 + 256 = 1634 
public class TestLpDemo14 {

	static boolean isArmStrong(int n) {
		boolean status = false;
		int r = 0;
		int sumP = 0;
		int temp = n;

		String str = Integer.toString(n);// 1634
		int digitCount = str.length();// 4
		System.out.println("Digit count : " + digitCount);

		// 153!=0
		while (n != 0) {
			r = n % 10;// 153 %10 --> 3, 15%10 --> 5, 1%10--> 1
			n = n / 10;// 153/10 --> 15, 15/10 --> 1, 1/10 --> 0
//			sumP = sumP + r * r * r;
			sumP += Math.pow(r, digitCount);
		}

		System.out.println("Sum : " + sumP);

		if (sumP == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		boolean isArmstr = isArmStrong(num);

		if (isArmstr) {
			System.out.println("The Given number is Armstrong !");
		} else {
			System.out.println("The Given number is not a armstorng number : ");
		}
		sc.close();
	}
}
