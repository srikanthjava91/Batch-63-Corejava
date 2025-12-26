package com.arrays;

//WAP to represent array with ages.
public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Declaration
		int[] ages;

		// creation
		ages = new int[5];// 0 1 2 3 4

		// Initialization
		ages[0] = 21;
		ages[1] = 23;
		ages[2] = 22;
		ages[3] = 20;
		ages[4] = 21;

		// Representation with for loop
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}

		// Representation with for each loop
		for (int age : ages) {
			System.out.println(age);
		}

//		System.out.println(ages[0]);
//		System.out.println(ages[1]);

		// Variable must provide either dimension expressions or an array initializer
//		ages = new int[];

	}
}
