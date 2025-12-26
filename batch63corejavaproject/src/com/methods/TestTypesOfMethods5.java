package com.methods;

import java.util.Scanner;

//WAP for finding areas of Triangle, Circle & Rectangle ..? 
public class TestTypesOfMethods5 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("Enter Base value : ");
		double base = sc.nextDouble();
		System.out.println("Enter height vlaue : ");
		double height = sc.nextDouble();
		double areaT = findAreaOfTriangle(base, height);
		System.out.println("Area of Trainagle : " + areaT);

		System.out.println("******************************");
		System.out.println("Enter len : ");
		double len = sc.nextDouble();

		System.out.println("Enter brd : ");
		double brd = sc.nextDouble();

		double areaR = findAreaOfRectangle(len, brd);
		System.out.println("Area of Rectangle : " + areaR);

		System.out.println("******************************");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double areaC = findAreaOfCircle(r);
		System.out.println("Area of Circle : " + areaR);

		System.out.println("main method Ended ");

	}

	// (b*h)/2
	static double findAreaOfTriangle(double base, double height) {
		double tArea = 0;
		tArea = (base * height) / 2;
		return tArea;
	}

	// l*b
	static double findAreaOfRectangle(double l, double b) {
		double rArea = 0;
		rArea = l * b;
		return rArea;
	}

	// PiR^2
	static double findAreaOfCircle(double r) {
		double cArea = 0;
		// double java.lang.Math.PI : 3.141592653589793
		cArea = Math.PI * r * r;
		return cArea;
	}

}
