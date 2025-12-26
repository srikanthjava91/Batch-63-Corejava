package com.methods;

public class TestDemo1 {

	public static void main(String[] args) {
		double s = method1();
		System.out.println(s + 20);// 30

		System.out.println(method2());// A
		System.out.println(method3());// 65
	}

	static char method2() {
		int a = 65;
		return (char) a;
	}

	static int method3() {
		char c = 'A';
		return c;
	}

	static double method1() {
		float a = 10;
		float b = 20;
		System.out.println(a);
		return a;
	}

}
