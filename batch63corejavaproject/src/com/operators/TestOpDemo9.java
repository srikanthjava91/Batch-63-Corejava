package com.operators;

import java.util.Scanner;
//Ternary Operators 
//WAP to find which variable is big ..? 
//syntax : (condition)?st1:st2

public class TestOpDemo9 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		int max = 0;
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("max : " + max);

//		String name1 = "Srikanth";
//		String name2 = "Venkata Naga";
//		String maxS = "";
//		maxS = (name1.length() > name2.length()) ? name1 : name2;
//		System.out.println("The Maximum Strings from a given String : " + maxS);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your age  :  ");
//		int age = sc.nextInt();
//		String eligibility = "";
//		eligibility = (age > 18) ? "Yes" : "NO";
//		System.out.println("The above person is eligible or not for driving..? " + eligibility);

//		int a = 10;
//		int b = 20;
//		int max = 0;
//		max = (a > b) ? a : b;
//		System.out.println("max value from above two are : " + max);
	}
}
