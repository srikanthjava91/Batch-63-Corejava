package com.languagefundamentals;

public class TestTypesVariablesDemo1 {

	// primitive + instance variable
	int a1 = 100;

	// Object + instance variable
	String name1 = "Miya Bhai";

	// primitive + static variable
	static int s2 = 91;
	// Object + static variable
	static String name2 = "India";

	static void hello() {
		System.out.println("hello method called ");
		TestTypesVariablesDemo1 t = new TestTypesVariablesDemo1();

		System.out.println(s2);
		System.out.println(name2);
		System.out.println(t.a1);
		System.out.println(t.name1);
//		System.out.println(t.x);//x cannot be resolved to a variable
		System.out.println("hello method ended ");

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		hello();

		// Illegal modifier for parameter x; only final is permitted
		final int x = 100;

		System.out.println("***********var ******");
		var name = "Java";
		var id = 10;
		var height = 5.9;
		var isTasty = true;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(height);
		System.out.println(isTasty);
		System.out.println("***********var ******");

		TestTypesVariablesDemo1 t1 = new TestTypesVariablesDemo1();

		// primitive + local
		int s2 = 92;
		// Object + local
		String name2 = "Bharath";

		// Accessing instance data
		System.out.println(t1.a1);
		System.out.println(t1.name1);

		// Accessing local data
		System.out.println(s2);
		System.out.println(name2);

		// Accessing static data
		System.out.println(TestTypesVariablesDemo1.s2);
		System.out.println(TestTypesVariablesDemo1.name2);

		// Yes, We can access static data by using Object reference variables.
		// But, Compiler will give Warning like below.
		// The static field TestTypesVariablesDemo1.s2 should be accessed in a static
		// way
		System.out.println(t1.s2);// 91
		System.out.println(t1.name2);// India

		TestTypesVariablesDemo1 t2 = null;
		System.out.println(t2.s2); // 91
//		System.out.println(t2.a1);// NPE null dot any operation is NPE

	}
}
