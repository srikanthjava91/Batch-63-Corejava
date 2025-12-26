package com.accessmodifiers02;

import com.accessmodifiers01.TestAccModDemo1;

public class TestAccDemo3 extends TestAccModDemo1 {

	public static void main(String[] args) {

		System.out.println("main method strated from TestAccDemo3");
		TestAccModDemo1 t1 = new TestAccModDemo1();

//		 Even though the class is public,
//		the data members are default so we cannot access 
//		default data members outside of the packages.
//		System.out.println(t1.a2);
//		System.out.println(t1.name2);
//		t1.method2();

		System.out.println("******protecetd********");
		TestAccDemo3 t3 = new TestAccDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();

//		 Accessing the protected data members outside of the packages not possible.
//		System.out.println(t1.a4);
//		System.out.println(t1.name4);
//		t1.method4();

		System.out.println("******<public>********");
		// Accessing the public data members outside of the package
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();
	}
}
