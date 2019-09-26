package com.java;

public class TryCatchFinallyDemo {

	@SuppressWarnings("finally")
	String test(String a) {
		try {
			System.out.println("Inside try");
			a = null;
			a = a.toString();
			return "try";
		} catch (Exception e) {
			System.out.println("Inside catch");
			System.out.println(e);
			System.out.println(e.getMessage());
			// return "Catch";
		} finally {
			System.out.println("Inside finally");
			return "finally";
		}
		// return "test";
	}

	public static void main(String[] args) {

		TryCatchFinallyDemo tryCatchFinallyDemo = new TryCatchFinallyDemo();
		System.out.println(tryCatchFinallyDemo.test("pawan"));
	}

}
