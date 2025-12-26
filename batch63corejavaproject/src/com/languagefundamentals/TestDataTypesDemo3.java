package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		// String to int
		// String to long
		String s1 = "123";
		int i = Integer.parseInt(s1);
		System.out.println(i + 20);// 12320

//		Integer i1 = 125;
//		Integer i2 = 125;
//
//		String s5 = "Srikanth";
//		String s6 = new String("Srikanth");
//
//		System.out.println(s5 == s6);//false
//		System.out.println(i1 == i2);//true

		BigInteger bi1 = new BigInteger("100");
		BigDecimal bi2 = new BigDecimal(bi1);

//		String bi2 = bi1.toString();

		BigDecimal bd2 = new BigDecimal("345");

		BigDecimal bd3 = bd2.add(bi2);
		System.out.println(bd3);

	}

}
