package com.java;

public class ForkJoin4AddDemo {

	public static void main(String[] args) {

		long result = ForkJoin4Add.startForkJoinSum(100000);

		System.out.println("Final Result is ::  " + result);
	}

}
