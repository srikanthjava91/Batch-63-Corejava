package com.stringhandling;

import java.util.Scanner;

//equals vs equasIgnoreCase
//loging --> username 
public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username : ");
		String uname = sc.next();
		System.out.println("Enter a password ");
		sc.nextLine();
		String passowrd = sc.nextLine();

		if (uname.equalsIgnoreCase("Admin") && passowrd.equals("Admin@12345")) {
			System.out.println("Welcome Admin !!");
		} else {
			System.err.println("Invalid user credentials !");
		}
		sc.close();
	}
}
