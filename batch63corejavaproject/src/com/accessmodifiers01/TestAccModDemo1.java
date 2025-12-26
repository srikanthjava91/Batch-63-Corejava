package com.accessmodifiers01;

abstract interface In1 {

}

public strictfp class TestAccModDemo1 {

	public TestAccModDemo1() {
		System.out.println("no arg constructor called ");
	}

	static {
		System.out.println("static block !");
	}

	{
		System.out.println("instance block ");
	}

	// protected data members
	protected int a4 = 45;
	protected String name4 = "Rohit";

	protected void method4() {
		System.out.println("Hello method4a");
	}

	// public data members
	public int a3 = 18;
	public String name3 = "Virat";

	public void method3() {
		System.out.println("Hello method3");
	}

	// <default> Data members
	int a2 = 7;
	String name2 = "MSD";

	void method2() {
		System.out.println("hello method2");
	}

	// private Data members = variables + methods
	private int a1 = 10;
	private String name1 = "Sachin";

	private void method1() {
		System.out.println("hello method1 ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestAccModDemo1 t1 = new TestAccModDemo1();

		System.out.println("*******private*******");
		// Accessing the private data members within the class
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		System.out.println("******<default>********");
		// Accessing the default data members within the class
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		System.out.println("******public********");
		// Accessing the public data members within the class
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		System.out.println("******protecetd********");
		// Accessing the protected data members within the class
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}

}
