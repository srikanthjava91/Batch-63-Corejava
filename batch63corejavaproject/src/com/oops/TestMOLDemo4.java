package com.oops;

//Rule for mOL is " 
//Note : Method signature = name of the method + arguments only but not return type.
//1) Method signature(name + arguments) should not be same.
public class TestMOLDemo4 {

	void main() {
		System.out.println("main method strated !");
//		addition(10, 20);// The method addition(int, float) is ambiguous for the type TestMOLDemo4
		addition(10, 15.5F);
		addition(10F, 15);
//		hello(new Object());
		hello("Hello");
//		hello(null);

	}

//	void hello(Object o) {
//		System.out.println("in Object args ");
//	}

	void hello(String s) {
		System.out.println("in string args !!");
	}
	
	void hello(StringBuffer sb) {
		System.out.println("in stringB args !!");
	}

	void addition(int a, float b) {
		System.out.println("addition with int float void is return type");
	}

	void addition(float a, int b) {
		System.out.println("addition with float int void is return type");
	}
//
//	int addition() {
//		System.out.println("addition with no arg int is return type");
//		return 10;
//	}

}
