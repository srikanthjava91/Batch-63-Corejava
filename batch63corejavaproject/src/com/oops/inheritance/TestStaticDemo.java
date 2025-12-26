package com.oops.inheritance;

public class TestStaticDemo {

	public static void method1(int i) {
		System.out.println("method1 from parent ");
		System.out.println("i value :" + i);
	}

	public void method2(int i) {
		System.out.println("method1 from parent ");
		System.out.println("i value :" + i);
	}

	public static void main(String[] args) {
		System.out.println("method1 from parent ");
		System.out.println("main method called from TestStaticDemo");
	}

}

class TestStaticDemo1 extends TestStaticDemo {

	public static void method1(int i) {
		System.out.println("method1 from child ");
		System.out.println("i value :" + i);
	}
	
	public void method2(int i) {
		System.out.println("method2 from child ");
		System.out.println("i value :" + i);
	}

	public static void main(String[] args) {
		System.out.println("main method called from TestStaticDemo1");
		TestStaticDemo1.method1(10);
	}

}
