package com.oops;

import java.util.Scanner;

//WAP to find the Areas of Rectangle, Triangle, Circle, Square.?

public class TestMOLDemo3 {

	// instance method
	void main() {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a side");
		float side = sc.nextFloat();
		double arSq = getArea(side);
		System.out.println("Area of Square is : " + arSq);

		System.out.println("Enter a length value");
		long length = sc.nextLong();
		System.out.println("Enter a Breadth value ");
		long breadth = sc.nextLong();
		double arRec = getArea(length, breadth);
		System.out.println("Area of Rectangle is : " + arRec);
	}

	// Get area of Square
	double getArea(float side) {
		return side * side;
	}

	// get Area of Rectangle
	double getArea(long length, long breadth) {
		return length * breadth;
	}

	// get Area of Circle
	double getArea(double radius) {
		return Math.PI * radius * radius;
	}

	// get Area of Triangle
	double getArea(float base, double height) {
		return 0.5 * base * height;
	}

}
