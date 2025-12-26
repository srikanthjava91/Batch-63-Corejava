package com.stringhandling;

public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("main metjod started ");

		String s = "Srikanth";
		byte[] arrBytes = s.getBytes();

		int left = 0;// S
		int right = arrBytes.length - 1;// h
		byte temp = 0;

		while (left < right) {
			temp = arrBytes[left];
			arrBytes[left] = arrBytes[right];
			arrBytes[right] = temp;
			left++;
			right--;
		}

		for (byte b : arrBytes) {
			System.out.print((char) b);
		}

	}
}
