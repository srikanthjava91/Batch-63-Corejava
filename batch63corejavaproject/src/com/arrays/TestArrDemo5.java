package com.arrays;

// WAP to print sum of the elements and avg of the elements ..? 
public class TestArrDemo5 {

	public static void main(String[] args) {

		int[] marks = { 90, 63, 95, 50, 65, 83 };// 0 1 2 3 4 5
		double totalMarks = 0;
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			totalMarks = totalMarks + marks[i];
//		}

		for (int m : marks) {
			totalMarks += m;
		}

		avg = totalMarks / marks.length;

		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Avg : " + avg);

	}

}
