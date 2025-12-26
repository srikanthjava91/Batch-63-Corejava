package com.arrays;

//Q) WAP to initialize the elements using{} and print the values in a reverse order..?
public class TestArrDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int[] numbers = { 10, 20, 30, 40, 50 };// 0 1 2 3 4
		System.out.println(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println("Reverse array ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		for (int n : numbers) {
			System.out.print(n + " ");
		}

	}
}
