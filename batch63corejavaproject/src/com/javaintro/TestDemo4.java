package com.javaintro;

//Without main method there is no chance of execution in java.
//But, Before 1.5 version, 
//we were able to execute without main method with the help of static block.

//Execution of the program : 
//1) First, JVM will check is there any main method or not, 
//if main method is available instead of executing it will check is there is any static blocks.
//2) Second, If static blocks available in your program first, 
//JVM will execute static blocks and then executes main method.

//3) When we have multiple static block, it executes line by line.

//4) instance blocks will be loading whenever we create object.

//5) Whenever we have, static variable first, static block second & main method then
//static variable will execute first and then static block and then static main method..

//6 if static block and static variable both are available then JVM will check the order.
public class TestDemo4 {
	
//	System.out.println("Vcube Java Students");

	static {
		System.out.println("Hello static block1 !");
	}

	static TestDemo4 t4 = new TestDemo4();

	static {
		System.out.println("Hello static block2 !");
	}

	{
		System.out.println("Hello instance block ");
//		TestDemo4 t4 = new TestDemo4();
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
	}

}
