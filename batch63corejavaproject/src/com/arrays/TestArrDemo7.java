package com.arrays;

// WAP to find min & max element(number/ String) from an Array ..?
public class TestArrDemo7 {

	public static void main(String[] args) {

		int[] numbers = { 10, 9, 18, -5, 6, -4, 1, 2 };

		int min = numbers[0];// 10 9 -5
		int max = numbers[0];// 10

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max =numbers[i];
			}
		}

//		for (int n : numbers) {
//			if (n < min) {
//				min = n;
//			} else if (n > max) {
//				max = n;
//			}
//		}

		System.out.println("min element from an array : " + min);
		System.out.println("max element from an array " + max);

	}

}
