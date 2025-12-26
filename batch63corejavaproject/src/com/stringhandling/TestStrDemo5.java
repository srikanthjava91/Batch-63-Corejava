package com.stringhandling;

public class TestStrDemo5 {

	public static void main(String[] args) {
		String s1 = "Virat";
		s1.concat("Kohli");
		System.out.println(s1);// Virat

		s1 = s1.concat("Kohli");
		System.out.println(s1);// ViratKohli
	}
}
