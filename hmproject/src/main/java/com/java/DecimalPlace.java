package com.java;

public class DecimalPlace {

	public static void main(String[] args) {
		Double x = 1234.12;
		StringBuffer stringBuffer = new StringBuffer(Double.toString(1234.112));
		System.out.println(stringBuffer.toString());
		int i; // general purpose character index
		int exponent;
		int decimalPlaces;
		if ((i = stringBuffer.indexOf("E")) > -1) { // scientific notation...
			// turn scientific notation exponent into an integer
			exponent = Integer.parseInt(stringBuffer.substring(i + 1));
			// truncate the exponent from the StringBuffer
			stringBuffer = stringBuffer.delete(i, stringBuffer.length());
		} else { // decimal notation, could be trailing zero
			exponent = 0; // no exponent, so zero
			// point i to trailing zero and truncate it, if there is one
			if (stringBuffer.charAt((i = stringBuffer.length() - 1)) == '0') {
				stringBuffer = stringBuffer.deleteCharAt(i); // delete trailing
																// zero
			}
		}
		// stringBuffer now contains only significant digits to the
		// right of the decimal point, if there are any
		decimalPlaces = stringBuffer.length() - 1 - stringBuffer.indexOf(".") - exponent;
		// zero or positive number is decimal places
		// negative number is number of zeroes to the left of the decimal point
		// between the decimal point and the least significant digit
		System.out.println(decimalPlaces);
		// Double r = appendDecimalValue(x, decimalPlaces);
	}

	private static void appendDecimalValue(Double x, int decimalPlaces) {
		Double resultantNumber = null;
		if (decimalPlaces == 0) {
			resultantNumber = (x * 100) / 100;
		}

	}

}
