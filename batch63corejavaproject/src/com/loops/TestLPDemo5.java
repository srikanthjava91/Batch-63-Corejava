package com.loops;

import java.util.Scanner;

//WAP to print math table ..? 
//input is 5 and 10
//output : 
//5 * 1 = 5 
//5 * 2 = 10 
//5 * 3 = 15 
//5 * 4 = 20
//5 * 5 = 25 
//5 * 6 = 30 
//5 * 7 = 35 
//5 * 8 = 40 
//5 * 9 = 45
//5 * 10 = 50
public class TestLPDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print a match table");
		int n = sc.nextInt();
		System.out.println("Enter a number up to where you want to print ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}
}
