package com.java;

public class ExtractWordDemo {

	public static void main(String[] args) {
		String value = "Relocation operation completed successfully With IpAddress:10.13.4.5";

		String strArray[] = value.split("With");

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i] + "\n");
		}
	}

}
