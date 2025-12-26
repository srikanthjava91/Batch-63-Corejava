package com.arrays;

public class TestArrDemo18 {

	public static void main(String[] args) {
		int[][][] arr = new int[3][4][5];
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[0][0].length);

//		0 1 2  0 1 2   0 1 2

//		000 001 002 
//		010 011 012
//		020 021 022  

//		100 101 102 
//		110 111 112 
//		120 121 122

//		200 201 202 
//		210 211 212 
//		220 221 222

		arr[0][0][0] = 100;
		arr[1][1][1] = 200;
		arr[2][2][2] = 300;

		for (int[][] arr2 : arr) {
			for (int[] a1 : arr2) {
				for (int a : a1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				for (int k = 0; k < arr[i][j].length; k++) {
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

	}

}
