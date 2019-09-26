package com.java;

public class ConvertStringToInt {

	public static void main(String[] args) {
		ConvertStringToInt.stringtoint("-123");

	}

	public static void stringtoint(String s) {
		boolean isNegative = false;
		int number = 0;
		if (s.charAt(0) == '-') {
			isNegative = true;
		} else {
			number = number * 10 + s.charAt(0) - '0';

		}

		for (int i = 1; i < s.length(); i++) {

			number = number * 10 + s.charAt(i) - '0';

		}
		if (isNegative) {
			number = 0 - number;
		}
		System.out.println(number);
	}

}
