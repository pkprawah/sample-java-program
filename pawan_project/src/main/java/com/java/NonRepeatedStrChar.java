package com.java;

import java.util.Scanner;

public class NonRepeatedStrChar {

	public static void main(String[] args) {
		System.out.println("Please Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int f = 0;
		for (int i = 0; i < str.length(); i++) {
			f = 0;
			for (int j = str.length() - 1; j > i; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					str = str.replaceAll("" + str.charAt(i), "");
					f = 1;
					i--;
					break;
				}
			}
			if (f == 0) {
				System.out.println("First Non repeated Char is : " + str.charAt(i));
				break;
			}
		}
		sc.close();
	}

}
