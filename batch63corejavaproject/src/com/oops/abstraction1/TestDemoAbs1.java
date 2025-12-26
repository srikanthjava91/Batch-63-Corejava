package com.oops.abstraction1;

public class TestDemoAbs1 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		System.out.println("*************A");
		
		//Cannot instantiate the type TestAbs
//		TestAbs a1 = new TestAbs();
		
		TestAbs.welome();
		
		TestIn1 a = new TestA();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		a.method5();
//		a.hello();
		

		System.out.println("*************B");
		TestAbs b = new TestB();
		b.method1();
		b.method2();
		b.method3();
		b.hello();
		

		System.out.println("*************C");
		TestAbs c = new TestC();
		c.method1();
		c.method2();
		c.method3();

	}

}
