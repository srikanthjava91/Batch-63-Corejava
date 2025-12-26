package com.arrays;

//Jagged Arrays : Array of Arrays !!
public class TestArrDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int[][] numbers = new int[3][];// 0 1

		numbers[0] = new int[3]; // 3 //0 1 2
		numbers[1] = new int[4];// 4 // 0 1 2 3
		numbers[2] = new int[5];

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;

		numbers[1][0] = 40;
		numbers[1][1] = 40;
		numbers[1][2] = 40;
		numbers[1][3] = 40;

		for (int[] a1 : numbers) {
			for (int a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				System.out.print(numbers[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
