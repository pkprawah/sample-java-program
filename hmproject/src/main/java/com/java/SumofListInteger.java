package com.java;

import java.util.List;

class SumofListInteger {

	public static Integer sum(List<Integer> inputlist) {

		int sum = 0;
		for (Integer value : inputlist) {
			sum += value;
		}
		System.out.println("Sum is :: " + sum);
		return sum;
	}

	public int hashCode() {
		return hashCode() + hashCode();
	}

}
