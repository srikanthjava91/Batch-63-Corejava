package com.oops.abstraction;

public interface Animal {
	
	public static final String ORG_NAME = "Animal Park";

	public static void main(String[] args) {
		System.out.println("main method started in interface !");

	}

	public abstract void sound();

	public abstract void eat();

	public abstract void sleep();

	// Why default methods..>
	// To avoid backward compatibility we use default methods
	// default methods we can override in implemented classes.
	// We can create any number of default methods.

	// private methods: To avoid duplicate code from default methods we must need to
	// use private methods.
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	// Default methods are allowed only in interfaces.
	public default void walk() {
		System.out.println("Every animal can walk !");
		hello();

	}

	// Default methods are allowed only in interfaces.
	public default void run() {
		System.out.println("Every animal can run !");
		hello();
	}

	// static methods : To provide constant behavior for all classes , we must need
	// to create static method in interfaces.
	// static methods we cannot override.
	// static methods, we cannot call by using interface or class references, we can
	// call only by using interface name.
	static void breath() {
		System.out.println("Every animal must breath !!");
	}

}
