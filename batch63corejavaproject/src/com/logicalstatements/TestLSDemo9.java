package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day ");
		String day = sc.next();

		switch (day) {
		case "Monday" -> {
			System.out.println("Enter a session");
			String session = sc.next();
			System.out.println("Mondays are Lazy but Srikanth sir session we should not miss");
			switch (session) {
			case "Morning" -> System.out.println("We should listen the classes");
			case "Afternoon" -> System.out.println("Attend the labs ");
			case "Evening" -> System.out.println("repeat the practice !");
			
			}
		}

		case "Tuesday" -> System.out.println("Rotinue day ");
		case "Wednesday" -> System.out.println("Rotinue day ");
		case "Thursday" -> System.out.println("Rotinue day ");
		case "Friday" -> System.out.println("Rotinue day ");
		case "Saturday" -> {
			System.out.println("Enter a session");
			String session = sc.next();
			System.out.println("Special day in Vcube will helpful for a get a job");
			switch (session) {

			case "Morning" -> System.out.println("We should not miss Exams ");
			case "Afternnon" -> System.out.println("We should not Mockup interviews ");
			case "Evening" -> System.out.println("No classes we can plan for movie");
			}
		}
		
		default -> System.out.println("Invalid entry ");
		}
	}
}
