package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo15 {

	public static void main(String[] args) {
		System.out.println("main method srated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int vowelsCount = 0;
		int consonantsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.toLowerCase().charAt(i);

			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelsCount++;
				} else {
					consonantsCount++;
				}
			}
		}
		
		System.out.println("Vowels Count " + vowelsCount);
		System.out.println("consonants count : " + consonantsCount);
	}
}
