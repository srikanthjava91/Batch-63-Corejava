package com.stringhandling;

class Student {

	@Override
	public String toString() {
		return "Ramesh";
	}

}

public class TestStrDemo21 {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		String s2 = new String("Srikanth");
		System.out.println(s2);

	}

}
