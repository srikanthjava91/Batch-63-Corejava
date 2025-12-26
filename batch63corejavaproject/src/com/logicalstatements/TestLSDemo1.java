package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some text ");
		String text = sc.nextLine();// morning

		if (text.contains("morning")) {
			System.out.println("Hello guys, Good morning, Have a Good day ");
		}

		System.out.println("main method ended ");

	}
}
