package com.operators;

//Comparison Operators or Relational Operators --> boolean expression
//== != < <= > >= 

//== operators will compare the value when it is primitive data types.
//== operators will compare the addresses when it is Object data types.
//.equals() method will always checks the content from the String.

public class TestOpDemo3 {

	public static void main(String[] args) {

		//String Literals will store it in a same address 
//		when we have same data. --> SCP : String Constant Pool
		String s1 = "Java";
		String s2 = "Java";
		
		//String Object  --> Heap area
		String s3 = new String("Java");
		
		
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		
		System.out.println(s1.equals(s3));//true

		System.out.println("**************");
		float a = 10;
		double b = 10;
		System.out.println(a == b);// true
		System.out.println(a != b);// false
		System.out.println(a < b);// false
		System.out.println(a <= b);// true

		System.out.println(a > b);// false
		System.out.println(a >= b);// true

		System.out.println("**************");
		char c = 'A';
		char c1 = 65;
		System.out.println(c == c1);
		System.out.println("************");
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);// false
		// The operator != is undefined for the argument type(s) boolean, float
//		System.out.println(b1 != a);
	}

}
