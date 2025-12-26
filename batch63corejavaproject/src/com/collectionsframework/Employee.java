package com.collectionsframework;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	int empAge;
	double empSalary;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}

	public Employee(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.empId < o.empId) {
			return -1;
		} else if (this.empId > o.empId) {
			return 1;
		} else {
			return 0;
		}

	}

}
