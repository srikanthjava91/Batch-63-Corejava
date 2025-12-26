package com.languagefundamentals;

//Primitive Data Types
//byte short int long --> float double 
//int --> char 
public class TestDataTypesDemo1 {

	// RHS is always a value
	// LHS is always a variable
	// Note : By default all numbers which we given RHS is equals to int.

	// 1 byte = 8 bits
	// Type mismatch: cannot convert from int to byte
	// Explicit Type casting
	// -128 -127 -126 --------- 0 1 2 3 ----- 126 127
	byte b = (byte) 257;// Range : -128 to 127 -->+1 --->

//	 Type mismatch: cannot convert from int to short
//	2 bytes = 16 bits ---> 2^n-1 -32768 to 32767
	short s = b; // Implicit Type casting

//  4 bytes : 32 bits 
//	if we give more than int value it will throw a compile time error as below.
//	CE : The literal 2147483648 of type int is out of range.
//	//Type mismatch: cannot convert from long to int

	int i = 2147483647;

//	8 bytes : 64 bits
//	Whenever we work with long we must need to Specify suffix as L or l
	long l = 922337203685775807L;

//  4 bytes : 32 bits 
//	Whenever we work with float we must need to Specify suffix as F or f
//	Whenever we want to represent floating point data after decimal with only 5 to 7 digits.
	float f = 65.6576595678876678F;

	// Type mismatch: cannot convert from double to float
	float f1 = (float) 100.5;

	float f2 = 922337203685775807876756456578F;

//	8 bytes : 64 bits
//	Whenever we want to represent floating point data after decimal with only 15 to 16 digits.
	double d = 65.6576595678876678D;

	// 2 bytes = 16 bits
	// 32767+ 32768= 65535
	// The range of char is 0 to 65535
	char c = 'V';
	char c1 = '1';
//	char c2 = '10';//Invalid character constant
	char c2 = '@';

	// int can converting to char: Implicit
	char c3 = 65;// Ascii code

	char c4 = 6551;

	// Unicode charcaters
	char c5 = '\u0021';

//	Can we convert char to int ..? Yes
	int i3 = 'A';

//	only 1 bit 
	boolean boo = false;

	// Type mismatch: cannot convert from int to boolean
//	boolean b1 = 0;
//	boolean b2 = 1;

	// Type mismatch: cannot convert from String to boolean
//	boolean b3 = "false";

//	TRUE cannot be resolved to a variable
//	boolean b4 = TRUE;
//	boolean b5 = True;
//	boolean b6 = False;
//	boolean b7 = FALSE;

	public static void main(String[] args) {
		System.out.println("main method started ");

//		if(true) {
//			System.out.println("Hello ");
//			System.out.println("Hello ");
//			System.out.println("Hello ");
//		}

		TestDataTypesDemo1 t = new TestDataTypesDemo1();
		System.out.println("byte value : " + t.b);// 0
		System.out.println("short value : " + t.s);// 0
		System.out.println("int value : " + t.i);// 0
		System.out.println("int value : " + t.i3);// 0

		System.out.println("long value : " + t.l);// 0

		System.out.println("float value : " + t.f);// 0.0
		System.out.println("float value : " + t.f1);// 0.0
		System.out.println("float value : " + t.f2);// 0.0

		System.out.println("double value : " + t.d);// 0.0

		System.out.println("char value : " + t.c);//
		System.out.println("char value : " + t.c1);//
		System.out.println("char value : " + t.c2);//
		System.out.println("char value : " + t.c3);//
		System.out.println("char value : " + t.c4);//
		System.out.println("char value : " + t.c5);//
		System.out.println("boolean value : " + t.boo);// false

	}
}
