package com.oops.inheritance;

public class TestInDemo1 implements Cloneable {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		TestInDemo1 t1 = new TestInDemo1();
		// 372f7a8d
		System.out.println(t1);// Address of the object
		Object obj = t1.clone();// Shallow copy
		System.out.println("getclass() : " + t1.getClass());//Class com.oops.inheritance.TestInDemo1

		// 2f92e0f4
		System.out.println(obj);
		System.out.println(t1.equals(obj));// false

		int a = 0x372f7a8d;
		int b = 0x2f92e0f4;

		System.out.println("A value : " + a);
		System.out.println("B value : " + b);
		System.out.println("-----------------------");
		System.out.println(t1.hashCode());
		System.out.println(obj.hashCode());

		t1 = null;
		System.out.println("*******************");
		TestInDemo1 t2 = new TestInDemo1();
		TestInDemo1 t4 = t2;
		System.out.println(t2.equals(t4));
		System.out.println("***********************");

		System.gc();

	}
}
