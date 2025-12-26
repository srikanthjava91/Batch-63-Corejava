package com.operators;

public class TestOpDemo7 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;
		System.out.println(+a);// valid
		System.out.println(-a);// valid

		System.out.println("****************");
		System.err.println("post-increment ***********");
		System.out.println(a++);// 5--> a++ --> a= a+1 --> 6
		System.out.println(b++);// 6 --> b++ --> b = b+1 --> 7

		System.err.println("Pre-increment ***********");
		System.out.println(++a);// 7
		System.out.println(++b);// 8

		System.err.println("Pre-decrement ***********");
		System.out.println(--a);// 6
		System.out.println(--b);// 7

		System.err.println("post-decrement ***********");
		System.out.println(a--);// 6 --> 5
		System.out.println(b--);// 7 --> 6

		System.out.println("A value : " + a);// 5
		System.out.println("B value : " + b);// 6

	}

}
