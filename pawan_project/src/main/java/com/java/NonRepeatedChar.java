package com.java;

public class NonRepeatedChar {

	public static void main(String[] args) {

		char[] c = new char[] { 'P', 'A', 'P', 'N', 'J', 'P', 'K', 'A', 'J' };
		int start = 0;
		int last = c.length - 1;
		System.out.println("last value" + c.length);
		while (start <= last + 1) {
			char lastchar = 'N';

			if (start == last) {
				System.out.println("hello index equal" + start + "" + last);
				c[start] = '1';
				start++;
				last = c.length;
			}

			else if (c[start] != c[last]) {
				System.out.println("hello Not" + start + "" + last);
				last--;
			} else if (c[start] == c[last]) {
				System.out.println("hello character equals" + start + "" + last);
				lastchar = c[last];
				c[last] = '1';
				last--;

			}

		}

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
