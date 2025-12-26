package com.arrays;

public class TestArrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method stared");
		double[] numbers = { 10.5, -10, 15, 3, -8, 9, 4, 5, -18 };
		int sum = 0;
		for (double n : numbers) {
			sum += n;
		}
		System.out.println("Total SUm : " + sum);
	}
}
