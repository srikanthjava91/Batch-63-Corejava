package com.accessmodifiers01;

public class TestAccModDemo2 {

	public static void main(String[] args) {

		System.out.println("main methdo started from TestAccModDemo2");

		// Accessing the private data members outside of the classes not possible.
		// private scope is : within the class only.
		TestAccModDemo1 t1 = new TestAccModDemo1();

		// The field TestAccModDemo1.a1 is not visible
//		System.out.println(t1.a1);
//		The field TestAccModDemo1.name1 is not visible
//		System.out.println(t1.name1);
		// The method method1() from the type TestAccModDemo1 is not visible
//		t1.method1();

		System.out.println("******<default>********");
		// Accessing the default data members outside of the class within the package.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		System.out.println("******<public>********");
		// Accessing the public data members within the package
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		System.out.println("******protecetd********");
		// Accessing the protected data members within the package
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
