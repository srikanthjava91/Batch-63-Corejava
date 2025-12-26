package com.languagefundamentals;

public class TestLiteralsDemo1 {

	public static void main(String[] args) {

//		int a;
		//// CE --> The local variable a may not have been initialized
		/// JVM will not provide default values for local variables.
//		System.out.println(a);

		// Decimal Literals
		int a = 123;
		int a1 = 567;
		int a2 = 1230;

		System.out.println(a);// 123
		System.out.println(a1);// 567
		System.out.println(a2);// 1230

		// Octal Literals : will starts with 0
		// any number starts with 0 will consider as Octal
		// Octal base is 8 and we can store 0 to 7 numbers.
		int a3 = 0123;
//		 1*8^2 +2*8^1 +3*8^0 
//		64 + 16 + 3 = 83

		int a4 = 0567;
		int a5 = 0456;
//		int a6 = 0687;//The literal 0687 of type int is out of range 

		System.out.println(a3);// 83
		System.out.println(a4);// 375
		System.out.println(a5);// 302
//		System.out.println(a6);

	}
}
