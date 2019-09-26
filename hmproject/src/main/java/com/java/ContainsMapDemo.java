package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "pawan");
		map.put(2, "ankit");

		map.entrySet().stream().filter(x -> "something".equals(x.getValue())).map(x -> x.getValue())
				.collect(Collectors.joining());

		map.entrySet().stream().filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

		map.entrySet().stream().filter(x -> x.getKey() == 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		Map<Integer, String> filterOnValue = map.entrySet().stream()
				.filter(entry -> entry.getValue().equalsIgnoreCase("pawan"))

				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

		System.out.println("filters based on map value::" + filterOnValue);

	}

}
