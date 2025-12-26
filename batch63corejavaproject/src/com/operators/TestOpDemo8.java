package com.operators;

public class TestOpDemo8 {

	public static void main(String[] args) {
		int x = 20;
		int y = 30;

		System.out.println(++x);// 21
		System.out.println(x++);// 21 --> 22
		System.out.println(x);// 22

		System.out.println("*********");
		System.out.println(--y);// 29
		System.out.println(y--);// 29 --> 28
		System.out.println(y);// 28

		System.out.println(x++ + y++);// 50 --> 23 --> 29
		System.out.println(--x - --y);// -6 --> 22 --> 28

		System.out.println(x++ + y++ + --y - --x);//

		System.out.println("x value : " + x);// 22
		System.out.println("y value : " + y);// 28

		// 21 + 29 + 28 -22 = 56
		System.out.println(--x + ++y - ++x + --y);// 0
	}

}
