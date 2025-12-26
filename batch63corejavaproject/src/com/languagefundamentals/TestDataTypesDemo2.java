package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

class Dog {
	String name = "Puppy";
}

public class TestDataTypesDemo2 {

	String s2 = "Srikanth Java";// String Literals
	String s = new String("Srikanth");

	//// Type mismatch: cannot convert from String to StringBuffer
//	StringBuffer sb = "Java";

	// Type mismatch: cannot convert from int to BigInteger
	BigInteger bi1 = new BigInteger("88676546547689876564547");
	BigInteger bi2 = new BigInteger("88676546547689876564547");

	BigDecimal bd1 = new BigDecimal("20");
	BigDecimal bd2 = new BigDecimal(5);

	// int to Integer : primitive to Wrapper --> Auto-Boxing
	// Converting Primitive data to Wrapper is the concept of Auto-Boxing which came
	// at 1.5 version.
	// The constructor Integer(int) has been deprecated since version 9 and marked
	// for removal.

	// Internal working for Auto Boxing
	Integer i = new Integer("500");

	// null.anything is NPE

	// Converting Wrapper Object data types to primitive data types is the concept
	// of Auto-unboxing.
	int i1 = i;

	Float f = 5.9F;
	Character c = 'A';

	Dog d = new Dog();

	public static void main(String[] args) {

		TestDataTypesDemo2 t2 = new TestDataTypesDemo2();

		System.out.println("BigDecimal Info *******");
		System.out.println(t2.bd1.add(t2.bd2));
		System.out.println(t2.bd1.subtract(t2.bd2));
		System.out.println(t2.bd1.multiply(t2.bd2));
		System.out.println(t2.bd1.divide(t2.bd2));

		System.out.println("String Value : " + t2.s);
		System.out.println("Big Integer Value : " + t2.bi1);// CE
		System.out.println("BigDecimal Value : " + t2.bd1);// 0.0

		// The operator + is undefined for the argument type(s) BigInteger, BigDecimal
//		System.out.println(t2.bi + t2.bd);//\

		System.out.println("Addition : " + t2.bi1.multiply(t2.bi2));

		System.out.println("Integer value : " + t2.i);// 0
		System.out.println("Float value : " + t2.f);// 0.0
		System.out.println("Charcater value : " + t2.c);//

		System.out.println("Dog value : " + t2.d.name);//

	}
}
