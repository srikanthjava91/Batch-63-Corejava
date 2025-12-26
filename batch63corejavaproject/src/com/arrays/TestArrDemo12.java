package com.arrays;

//WAP to print int & String values in a rows and columns,,
public class TestArrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int[][] arr = new int[3][3];// 3*2 = 6
		// 0 1 2 // 0 1
		System.out.println(arr);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);

		// 00 01
		// 10 11
		// 20 21

		arr[0][0] = 10;
		arr[0][1] = 20;

		arr[1][0] = 30;
		arr[1][1] = 40;

		arr[2][0] = 50;
		arr[2][1] = 60;

		for (int[] a1 : arr) {
			for (int n : a1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
