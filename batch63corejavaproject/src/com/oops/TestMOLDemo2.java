package com.oops;

public class TestMOLDemo2 {
	{
		System.out.println("Hello instance ");
	}

	void main() {
		System.out.println("main method started !");
		addition();
		addition(10);
		addition(10, 20);// The method addition(int, float) is ambiguous for the type TestMOLDemo2

//		hello();

	}

//	String hello() {
//		return "Java is simple ";
//	}
	
//	void hello(){
	
//}

	void addition(int i, int j) {
		System.out.println("int i and int j args ");
		System.out.println(i + j);

	}

//
//	void addition(float i, float j) {
//		System.out.println("float i and float j args ");
//		System.out.println(i + j);
//	}
//
	void addition(int i, float j) {
		System.out.println("int i and float j args ");
		System.out.println(i + j);
	}

//
	void addition(float i, int j) {
		System.out.println("float i and int j args ");
		System.out.println(i + j);
	}

	void addition(double i) {
		System.out.println("in addion with double args!");
	}

	void addition(float i) {
		System.out.println("in addion with float args!");
	}

	void addition() {
		System.out.println("in addion with no args!");
	}

	void addition(int i) {
		System.out.println("In addition with int args ");
	}

}
