package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Jersey Number : ");
		int jno = sc.nextInt();// 7

		switch (jno) {
		case 7:
			System.out.println("MSD");
			System.out.println("Great Wicket Keeper !!");
			break;
		case 18:
			System.out.println("Virat Kohli");
			System.out.println("He is a Runmachine! !!");
			break;
		case 99:
			System.out.println("Aswin");
			System.out.println("He is a Good spinner !");
			break;
		case 8:
			System.out.println("Jadeja");
			System.out.println("He is a Good all-Rounder!!");
			break;

		default:
			System.out.println("with this jersey no player is avilable !!");

		}

		sc.close();
	}

}
