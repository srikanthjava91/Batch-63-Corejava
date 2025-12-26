package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Employee emp1 = new Employee(1, "srikanth", "c", "srikanth", "srikanth", 23, 9876567, 98765678987L);

		emp1.display();

//		emp1.setEid(18);
//		emp1.setFirstname("Kohli");
//		emp1.setLastname("Virat");
//		emp1.setUname("Virat");
//		emp1.setPhone(9972677655L);
//
//		System.out.println(emp1.getEid());
//		System.out.println(emp1.getFirstname());
//		System.out.println(emp1.getLastname());
//		System.out.println(emp1.getUname());
//		System.out.println(emp1.getPhone());
//		System.out.println(Employee.getCollegeId());

		// we cannot access the private data outside of the classes
//		emp1.uname="Hello";
//		System.out.println(emp1.uname);
//		System.out.println(emp1.age);
//		System.out.println(emp1.password);
//		System.out.println(emp1.firstname);
//		System.out.println(emp1.lastname);

	}

}
