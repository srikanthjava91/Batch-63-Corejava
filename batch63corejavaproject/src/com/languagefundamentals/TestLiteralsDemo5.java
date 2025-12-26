package com.languagefundamentals;

public class TestLiteralsDemo5 {

	TestLiteralsDemo5 t = null;

	public static void main(String[] args) {

//		Integer a = "null";

		String s = "null";
		System.out.println(s.length());// 4

//		String s1 = null;
//		System.out.println(s1.length());// NPE --> null . anything is NullPointerException

		boolean status = false;
		int age = 2_0_0;
		System.out.println(age + 100);

		if (age >= 18) {
			status = true;
		}

		System.out.println("*************");
		if (status) {
			System.out.println("You are Eligible for Driving or Voting ");
		} else {
			System.out.println("You are not Eligible for Driving or Voting ");
		}

	}

}
