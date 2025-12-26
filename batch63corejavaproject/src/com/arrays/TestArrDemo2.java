package com.arrays;

//Q) What is output of numbers..? 
//Q) While creating array, how much size we can give max..? 
//int max value --> 2147483647
//The literal 2147483648 of type int is out of range 
//if we give log values for an array we will get
//CE : Type mismatch: cannot convert from long to int
public class TestArrDemo2 {

	public static void main(String[] args) {
		int[] numbers = new int[0];// 0 1 2 3 4 5 6 7 8 9
		numbers[0] = 101;
		System.out.println(numbers);// [I@1dbd16a6

	}

}
