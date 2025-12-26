package com.arrays;

public class TestArrDemo17 {

	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30, 120, 130 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(arr);

		System.out.println(arr[0].length);// 5
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

//		for (int[] a1 : arr) {
//			for (int a : a1) {
//				System.out.print(a +" ");
//			}
//			System.out.println();
//		}

	}

}
