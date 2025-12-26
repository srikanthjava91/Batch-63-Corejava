package com.operators;

//Assignment Operators 
//=  += -= *= %= /= 
public class TestOPDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 10;
		int b = a;
		int x = 0;
		System.out.println(a);
		System.out.println(b);

//		x = x + 5.5;//Type mismatch: cannot convert from double to int
		x += 5.5;// x = x + 5.5
		System.out.println("x is : " + x);// 5

		x = x + 10;
		System.out.println(x);// 15

		// Note :
//		LHS is always a variable 
//		RHS is always a value 

//		x = x - 5.5;
		x -= 5.5;// x = x-5.5 --> x = 15-5.5 = 9.5
		System.out.println(x);// 9

//		x = x* 6.7;
		x *= 6.7;// x = x * 6.7 = 60
		System.out.println(x);

//		x = x % 7.8;
		x %= 7.7;
		System.out.println(x);// 60%7.7 --> 6

//		x = x/1.5;
		x /= 1.5;
		System.out.println(x);

	}

}
