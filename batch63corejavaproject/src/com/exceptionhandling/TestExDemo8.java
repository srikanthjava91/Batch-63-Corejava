package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number : ");
		int a = sc.nextInt();// 0

		try {
			System.out.println("in try !!");
			System.out.println(10 / a);
		} catch (Exception e) {
			System.err.println("in catch ");
		} finally {
			sc.close();
			System.out.println("in finally ");
		}

		System.out.println("main method ended1 !");

		System.out.println("main method ended2 !");

	}

}
