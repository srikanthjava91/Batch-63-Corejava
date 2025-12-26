package com.loops;

import java.util.Scanner;

//WAP to Convert Decimal to Binary ..? 
//input : 22 --> output : 10110 
//input 100 : ---> output : 1100100
public class TestLPDemo15 {

	static String convertDecimalToBinary(int num) {
		String str = "";
		int r = 0;

		// 22!=0
		while (num != 0) {
			r = num % 2;// 22%2 --> 0, 11%2--> 1, 5%2--> 1, 2%2 --> 0, 1%2 --> 1
			num = num / 2;// 22/2--> 11,11/2 --> 5, 5/2 --> 2, 2/2 --> 1, 1/2--> 0
			str = r + str;// concatenation
		}

		return str;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String binaryNum = convertDecimalToBinary(num);
		System.out.println("Binary number : " + binaryNum);
	}
}
