package com.operators;

public class TestOpDemo10 {

	public static void main(String[] args) {

		String s = "Srikanth";
		System.out.println(s instanceof String);

		Integer i = 10;
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);

//		CE:  Incompatible conditional operand types String and Integer
//		System.out.println(s instanceof Integer);//

		System.out.println(null instanceof String);
		System.out.println(null instanceof Integer);

	}

}
