package com.logicalstatements;

import java.util.Scanner;

//Note : Whenever we are not using {} for if condition, 
//which will consider only one statements but not multiple statements.
public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		boolean hasVoterId = false;

		if (age >= 18) {
			if (hasVoterId) {
				System.out.println("you are  eleigible for voting");
			} else {
				System.out.println("You are not eligible for Voting");
			}

		} else {
			System.out.println("Arey !! niku inka time undi ra");
		}

		System.out.println("***************");
		System.out.println("Enter a number ");
		int a = sc.nextInt();// 50

		System.out.println("Enter another number ");
		int a1 = sc.nextInt();// 30

		if (a > a1)
			System.out.println("a is big ");
		else
			System.out.println("a1 is big");

		System.out.println("Hello A1");
		System.out.println("Hello A !!");
		System.out.println("main method ended !");
	}

}
