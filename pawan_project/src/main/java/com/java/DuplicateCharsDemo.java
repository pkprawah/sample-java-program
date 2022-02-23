package com.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsDemo {

	public static void main(String[] args) {
		String name = "pawanwkumarppp";
		Map<String, Integer> hashmap = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			hashmap.put(String.valueOf(name.charAt(i)),
					name.length() - name.replaceAll(String.valueOf(name.charAt(i)), "").length());
		}

		System.out.println(hashmap);
		String sub = name.substring(4, 7);
		System.out.println(sub);

	}

}
