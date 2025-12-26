package com.loops;

////Q) WAP swap the values using third variable ..? 
//Q) WAP swap the values without using third variable ..? 
public class TestOPDemo6 {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

		a = a + b;// 15
		b = a - b;// 5
		a = a - b;// 10

		System.out.println("A value : " + a);// 5
		System.out.println("B value : " + b);// 10

		System.out.println("*****************");
		int x = 10;
		int y = 20;
		int temp = 0;

		temp = x;
		x = y;
		y = temp;

		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);

	}

}
