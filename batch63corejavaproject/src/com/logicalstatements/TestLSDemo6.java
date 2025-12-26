package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a week name : ");
		String day = sc.next();

		switch (day) {

		case "mon" -> {
			System.out.println("Monday");
			System.out.println("Monday's are lazy ");
		}
		case "tue" -> System.out.println("Tuesday");
		case "wed" -> System.out.println("Wednesday");
		case "thu" -> System.out.println("Thursday");
		case "fri" -> System.out.println("Friday");
		case "sat" -> System.out.println("Saturday");
		case "sun" -> System.out.println("Sunday ");
		default -> System.out.println("You entered wrong entry !!");

		}

		sc.close();
	}

}
