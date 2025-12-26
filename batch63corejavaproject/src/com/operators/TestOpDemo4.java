package com.operators;

//&& || ! 
public class TestOpDemo4 {

	public static void main(String[] args) {
		System.out.println("main method strated !");

		int x = 10;
		int y = 20;
		System.out.println("************* && *********");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("************* && *********");
		System.out.println(x > y && y < x);// false
		System.out.println(x > y && y > x);// false
		System.out.println(x < y && y < x);// false
		System.out.println(x < y && y > x && x != y);// true

		System.out.println("************* || *********");
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false
		System.out.println("************* || *********");
		System.out.println(x > y || y < x);// false
		System.out.println(x > y || y > x);// true
		System.out.println(x < y || y < x);// true
		System.out.println(x < y || y > x && x == y);// true
		
		System.out.println("******** !**************");
		System.out.println(!true);//false
		
		System.out.println(!(100 > 50));//true
		
//		System.out.println(10 && 20);
//		System.out.println(10 || 20);
//		System.out.println(10 ! 20);

	}

}
