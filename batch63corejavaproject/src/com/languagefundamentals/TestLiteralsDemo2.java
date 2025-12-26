package com.languagefundamentals;

//- Hexa-Decimal Literals (16): Hexa-decimal Literals starts with 0x
//	0 to 9 & a-f or A-F --> a/A = 10 b/B=11 c/C =12 d/D=13 e/E=14 f/F= 15
public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		int a =  0x123;
		int a1 = 0x457;
		int a2 = 0XABC;
		int a3 = 0Xbee;
		int a4 = 0xdad;
		int a5 = 0xbeaf;

//		1*16^2 +2*16^1 +3*16^0  = 256 + 32 + 3 = 291
		System.out.println(a);

		System.out.println(a1);// 1111

		System.out.println(a2);// 2748

		System.out.println(a3);//3054

		System.out.println(a4);

		System.out.println(a5);

	}

}
