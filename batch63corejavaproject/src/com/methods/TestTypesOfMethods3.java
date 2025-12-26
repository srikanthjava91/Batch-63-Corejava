package com.methods;

public class TestTypesOfMethods3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		double sal = getEmpSalary();
		double bonus = getBonus();

		double totalSalary = sal + bonus;
		System.out.println("Total Salary :  " + totalSalary);
		System.out.println("main method ended ");

	}

	static double getEmpSalary() {
		double sal = 100000.00;

		return sal;
	}

	static double getBonus() {
		double bonus = 5000.00;
		return bonus;
	}

}
