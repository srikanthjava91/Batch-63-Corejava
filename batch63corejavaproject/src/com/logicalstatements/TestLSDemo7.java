package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your T shirt size ");
		int t_ShirtSize = sc.nextInt();

		switch (t_ShirtSize) {
		case 36 -> System.out.println("T shirt size is small");
		case 38 -> System.out.println("T shirt size is Medium");
		case 40 -> System.out.println("T shirt size is Large");
		case 42 -> System.out.println("T shirt size is Xtra-Large");
		case 44 -> System.out.println("T shirt size is XXL");
		default -> System.out.println("T-shirt size is not availble !!");

		}

		sc.close();

	}

}
