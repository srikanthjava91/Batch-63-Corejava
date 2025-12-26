package com.arrays;

public class TestArrDemo16 {

	public static void main(String[] args) {
		int arr[] = { 40, 30, 10, 20, 50, 5, 3 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			int min = i;// 0 1 2 5 6
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

		System.out.println("After Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
