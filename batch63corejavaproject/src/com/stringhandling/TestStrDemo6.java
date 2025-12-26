package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {

		int[] i = { 1, 2, 3 };
		System.out.println(i);// Address of the Object

		char[] ch = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println(ch);// Hello
		
		System.out.println("Srikanth".charAt(5));

		// SCP
		String s1 = "Hello";
		s1 = "Welcome";
		System.out.println(s1);// welcome

		// Heap
		String s2 = new String("Java");
		s2 = new String("Srikanth");
		System.out.println(s2);
	}
}
