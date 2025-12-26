package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {

		System.out.println("Welcome to Vcube Matrimonial site !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();

		System.out.println("Hello " + name);

		System.out.println("Enter the salary : ");
		double salary = sc.nextDouble();

		System.out.println("Enter the assets : ");
		double assets = sc.nextDouble();

		if (salary >= 2000000.00 || assets >= 50000000.00) {
			System.out.println("Oh okay !! ");
			System.out.println("Enter your age : ");

			int age = sc.nextInt();

			if (age >= 22 && age <= 28) {
				System.out.println("Okay !! we can proceed furthur !!");

				System.out.println("Enter your height :");

				float height = sc.nextFloat();
				if (height >= 5.4 && height <= 6.0) {
					System.out.println("Okay !! Can you please enter your Weight : ");

					double weight = sc.nextDouble();
					if (weight <= 68 && weight >= 60) {
						System.out.println("Almost we are good to connect, lets discuss  more !!");
						
						System.out.println("Do you have sibilings ..? ");
						boolean siblingStatus = sc.nextBoolean();
						
						if(!siblingStatus) {
							System.out.println("Okay !! Let me think about you & connect back to you ");
						}else {
							System.out.println("Sorry !!!");
						}
						
					
					}else {
						System.out.println("You must need to gym !!");
					}

				} else {
					System.out.println("You too short !!");
				}

			} else {
				System.out.println("You are too old or you are too young to marry !");
			}

		} else {
			System.out.println("Sorry !! we are not looking for such kind of matches");
		}

	}
}
