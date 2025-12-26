package com.oops;

public class TestMOLDemo5 {

	void main() {
		System.out.println("main method started ");
		addition();
		addition("a", 10);
		addition("ab", 10, 20);
		addition("abc", 10, 20, 30);
		addition("abcd", 10, 20, 30, 40);
		addition("java", 10, 20, 30, 40, 50);
		addition("srikanth", 10, 20, 30, 40, 50, 60);
		addition("vcub", 10, 20, 30, 40, 50, 60, 70);
	}

	void addition() {
		System.out.println("Addition with no args");
	}

	// The variable argument type int of the method addition
//	must be the last parameter
	void addition(String a, int... args) {
		int sum = 0;
		for (int a1 : args) {
			sum = sum + a1;
		}
		System.out.println("Addition of numbers : " + sum);
	}

}
