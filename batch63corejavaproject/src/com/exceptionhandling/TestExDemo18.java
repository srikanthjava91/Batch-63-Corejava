package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo18 {

	public static void main(String[] args) throws JayException {
		System.out.println("main method strated !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter virat score today !");
		int score = sc.nextInt();
		if (score < 100) {
			throw new JayException("Virat missed his century so sad !!");
		}

		System.out.println("Enter age  ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println("You are eligible for Driving or Voting !");
		} else {
			throw new JayException("Babu chitti niku ink atime undi ra !!");
		}
	}
}
