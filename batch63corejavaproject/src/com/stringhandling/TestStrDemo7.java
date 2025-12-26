package com.stringhandling;

import java.util.Scanner;

//WAP to print Reverse of a Given String..? 
public class TestStrDemo7 {

	static String reverseString(String s1) {
		String rs = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);// J a v a
			rs = c + rs;
		}

//		for (int i = s1.length() - 1; i >= 0; i--) {
//			char c1 = s1.charAt(i);
//			System.out.print(c1);
//		}
//		System.out.println("");

		return rs;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String to print Reverse.");
		String str = sc.nextLine();// Java

		String rstr = reverseString(str);
		System.out.println("The Reverse String of a Given String is : " + rstr);

		if (str.equalsIgnoreCase(rstr)) {
			System.out.println("The Given String is Palindrome !");
		} else {
			System.out.println("The Given String is not Palindrome !");
		}
	}
}
