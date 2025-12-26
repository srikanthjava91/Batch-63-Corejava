package com.arrays;

import java.util.Scanner;

// WAP to read the elements from a Scanner..?

public class TestArrDemo8 {

	public static void main(String[] args) {
//		int a ;
//		System.out.println(a);//The local variable a may not have been initialized

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(arr.length);
		System.out.println("Read the elements : " + n + " times");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Represent the elements ");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
