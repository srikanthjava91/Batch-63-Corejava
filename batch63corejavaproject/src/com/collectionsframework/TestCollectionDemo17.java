package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionDemo17 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(4, "Jay", 22, 400000.00);
		Employee emp2 = new Employee(5, "Karthik", 22, 500000.00);
		Employee emp3 = new Employee(2, "Arun", 22, 600000.00);
		Employee emp4 = new Employee(1, "Balaji", 22, 500000.00);
		Employee emp5 = new Employee(3, "Naga Sai", 22, 600000.00);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		Collections.sort(empList);
		
		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
