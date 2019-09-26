package com.java;

import java.util.HashMap;
import java.util.Map;

public class MaptypeDemo {

	public static void main(String[] args) {
		Map<String, Object> hashmap = new HashMap<>();
		hashmap.put("A", 10);
		String s = hashmap.get("A").toString();
		Double.parseDouble(s);
		System.out.println("" + Double.parseDouble(s));

	}

}
