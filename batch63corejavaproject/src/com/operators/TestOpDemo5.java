package com.operators;

//5) Bitwise Operators (shift operators )
//& | ^ 
//<< >> <<<
public class TestOpDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		System.out.println("************* &*********");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println("*** & *********");
		//1 & 1 --> 1 
		System.out.println(45 & 76);// 12
		System.out.println(87 & 98);// 66
		System.out.println(43 & 56);// 40
		System.out.println(65 & 49);// 1
		
		System.out.println("*** | *********");
		//1 | 0 --> 1 //1 | 1 --> 1 // 0 | 1 --> 1
		System.out.println(45 | 76);// 109
		System.out.println(87 | 98);// 119
		System.out.println(43 | 56);// 59
		System.out.println(65 | 49);// 113
		
		System.out.println("******** ^ **********");
		//1 ^ 0 --> 1
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false

		System.out.println(45 ^ 76);//97
		System.out.println(87 ^ 98);//53
		System.out.println(43 ^ 56);//19
		System.out.println(65 ^ 49);//112

	}

}
