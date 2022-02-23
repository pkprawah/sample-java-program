package com.java;

import java.text.DecimalFormat;

public class DecimalFormatterDemo {

	public static void main(String[] args) {
		// formatting numbers upto 2 decimal places in Java
		DecimalFormat df = new DecimalFormat("######0.00");
		// System.out.println(df.format(364565.14));
		// System.out.println(df.format(364565.1454));

		// formatting numbers upto 3 decimal places in Java
		df = new DecimalFormat("######0.000");
		System.out.println(df.format(364565.14));
		System.out.println(df.format(364565));
		float x = Float.parseFloat(df.format(364565));
		System.out.println(df.format(364565.1454));
		System.out.println(df.format(364565.123454542723234));
		System.out.println("fgdfgfd  " + x);

	}

}
