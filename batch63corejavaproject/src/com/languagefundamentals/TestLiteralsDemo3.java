package com.languagefundamentals;

//Floating Liters
public class TestLiteralsDemo3 {

	int a = 10, b;
	char c = 'A', d = 'B';
	char c1 = 'a';

	public static void main(String[] args) {

		int a1 = 10, b1;

		System.out.println(a1);
//		System.out.println(b1);//	//The local variable b1 may not have been initialized
		TestLiteralsDemo3 t = new TestLiteralsDemo3();

		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);

		float f1 = 100;
		float f2 = 1230;
		float f3 = 0123;
		float f4 = 0123.5F;
		float f5 = 0123F;
		float f6 = 456F;
//		float f7 = 786.5;//Type mismatch: cannot convert from double to float
		float f8 = 0x123;
//		float f9 = 0x123.5F;//Invalid hex literal number
		float f10 = 0xBeaf;

		System.out.println(f1);// 100.0
		System.out.println(f2);// 1230.0
		System.out.println(f3);// 83.0
		System.out.println(f4);// 123.5
		System.out.println(f5);// 123.0
		System.out.println(f6);
		System.out.println(f8);// 291.0
		System.out.println(f10);

	}

}
