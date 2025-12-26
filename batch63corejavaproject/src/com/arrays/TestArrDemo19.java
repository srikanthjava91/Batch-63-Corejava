package com.arrays;

public class TestArrDemo19 {

	public static void main(String[] args) {

		int[][][] arr = { { { 1, 2, 3 }, { 1, 2, 3 } }, { { 1, 2, 3 }, { 1, 2, 3 } }, { { 1, 2 }, { 1, 2 } } };

		for (int[][] arr2 : arr) {
			for (int[] a1 : arr2) {
				for (int a : a1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
