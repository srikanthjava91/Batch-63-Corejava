package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo16 {

	public static void main(String[] args) {

		System.out.println("main method srated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		String[] arrStr = str.split("\\s");
		int count = 0;

		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
			count++;
		}

		System.out.println("words in a Given String : " + count);
	}
}
