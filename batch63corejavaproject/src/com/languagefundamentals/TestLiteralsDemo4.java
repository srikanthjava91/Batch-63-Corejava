package com.languagefundamentals;

public class TestLiteralsDemo4 {

	public static void main(String[] args) {

		// Collection of characters in double quotes will consider as String
		String s = "Java";// String Literals --> SCP
		// SCP --> String Constant Pool --> 1 object

		String s2 = "Java";// 0 objects

		// re-assign
		s = "Ajay";

		String s1 = new String("Srikanth Java");// String Object
		// Heap Memory --> 2 objects

		String s4 = new String("Srikanth Java");// --> 1 object in heap

		System.out.println(s);// Ajay
		System.out.println(s2);// Java

		System.out.println(s1);

		// Single quote characters
		char c = 'A';

		// ASCII code
		char c1 = 126;
		char c2 = 100;

		// uni-code
		char c3 = '\u0021';

		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
