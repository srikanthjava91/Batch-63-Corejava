package com.arrays;

import java.util.Scanner;

public class TestArrDemo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row : ");
		int r = sc.nextInt();

		System.out.println("Enter  column: ");
		int c = sc.nextInt();

		String[][] names = new String[r][c];

		for (String[] a1 : names) {
			for (String n : a1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < c; j++) {
//				System.out.print(names[i][j] +" ");
//			}
//			System.out.println();
//		}

	}

}
