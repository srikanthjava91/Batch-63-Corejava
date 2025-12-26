package com.javaintro;

public class StudentInfo {

	int studentId;
	String studentName;

	static int instId = 555;
	static String instName = "Vcube";

	public static void main(String[] args) {
		System.out.println("Welcome to Java World !!");

		StudentInfo s1 = new StudentInfo();

		System.out.println("Institution ID : " + instId);
		System.out.println("Institution name  :" + instName);
		System.out.println("Student ID : " + s1.studentId);
		System.out.println("Student Name : " + s1.studentName);
		s1.studentId = 1;
		s1.studentName = "Jai";

		System.out.println("s7 Object Info ****************");
		StudentInfo s7 = new StudentInfo();
		s7.studentId = 7;
		s7.studentName = "Narasimha";
		System.out.println("Institution ID : " + instId);
		System.out.println("Institution name  :" + instName);
		System.out.println("Student ID : " + s7.studentId);
		System.out.println("Student Name : " + s7.studentName);

		System.out.println("***********************");
		StudentInfo s2 = new StudentInfo();
		s2.studentId = 2;
		s2.studentName = "Siva Sai";
		System.out.println("Institution ID : " + instId);// 555
		System.out.println("Institution name  :" + instName);// Vcube
		System.out.println("Student ID : " + s2.studentId);// 0
		System.out.println("Student Name : " + s2.studentName);// null

		System.out.println("***********************");
		StudentInfo s3 = new StudentInfo();
		s3.studentId = 3;
		s3.studentName = "kusumakar";
		System.out.println("Institution ID : " + instId);// 555
		System.out.println("Institution name  :" + instName);// Vcube
		System.out.println("Student ID : " + s3.studentId);// 0
		System.out.println("Student Name : " + s3.studentName);// null

		System.out.println("*****s4******************");
		StudentInfo s4 = new StudentInfo();
		instId = 666;
		instName = "Vcube Software Solutions";

		System.out.println("Institution ID : " + instId);// 555
		System.out.println("Institution name  :" + instName);// Vcube
		System.out.println("Student ID : " + s4.studentId);// 0
		System.out.println("Student Name : " + s4.studentName);// null

		System.out.println("*******s5****************");
		StudentInfo s5 = new StudentInfo();

		System.out.println("Institution ID : " + instId);// 555
		System.out.println("Institution name  :" + instName);// Vcube
		System.out.println("Student ID : " + s5.studentId);// 0
		System.out.println("Student Name : " + s5.studentName);// null

	}
}
