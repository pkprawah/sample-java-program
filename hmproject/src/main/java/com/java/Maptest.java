package com.java;

import java.util.HashMap;
import java.util.Map;

public class Maptest {

	public static void main(String[] args) {
		Map<Integer, Employee> test = new HashMap();

		Employee e = new Employee();

		e.setName("Pawan");
		e.setDesignation("tl");

		test.put(1, e);

		System.out.println("before::" + test);
		for (Map.Entry<Integer, Employee> entry : test.entrySet()) {
			Employee value = entry.getValue();
			System.out.println("value ::" + value);
			value.setId(1111);
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("test ::" + test);

	}

}
