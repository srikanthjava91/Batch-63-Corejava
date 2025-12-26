package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			String s = "Srikanth Java";
			int a = s.length();//13

			int b = 14;

			if (b < a) {
				System.out.println(s.charAt(b));
			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}

		int[] arr = new int[4];// 0 1 2 3
		System.out.println(arr);
		try {
			arr[0] = 101;
			arr[1] = 102;
			arr[2] = 103;
			arr[3] = 104;
			arr[4] = 105;

		} catch (ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
			System.err.println(ae.toString());
		}

		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("main method ended ");
	}
}
