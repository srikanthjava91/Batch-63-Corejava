package com.arrays;

public class TestArrDemo15 {

	public static void main(String[] args) {
//		int arr[] = { 70, 50, 40, 80, 2, 10, 5 };

		int arr[] = { 1, 2, 3, 4 };
		int temp = 0;

		System.out.println("Before Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}

			if (!flag) {
				break;
			}
		}

		System.out.println("After Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
