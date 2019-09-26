package com.java;

public class Animal {

	public void noise() throws Exception {

		try {

			int i = 10 / 0;
		} catch (Exception e1) {

			throw e1;
		}
	}
}
