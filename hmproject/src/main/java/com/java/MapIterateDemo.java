package com.java;

import java.util.HashMap;

public class MapIterateDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		/*
		 * List<String> hostingProviders = Arrays.asList("Bluehost", "GoDaddy",
		 * "Amazon AWS", "LiquidWeb", "FatCow"); Consumer<String> action = new
		 * ConsumerImpl(); hostingProviders.forEach(action); // OR
		 * Consumer<String> consumer = (s) -> {System.out.println("map ::" +
		 * s);}; hostingProviders.forEach(s -> System.out.println("map ::" +
		 * s));
		 */

		// Consumer<Map.Entry<String, Integer>> consume =
		// map.

		/*
		 * forEach(Map.Entry<String, Integer> mapEntry) ->{
		 * 
		 * String alphabet = mapEntry.getKey(); Integer alphabetCount =
		 * mapEntry.getValue(); System.out.println("alphabet :" + alphabet +
		 * "alphabetCount :" + alphabetCount); }
		 * 
		 * });
		 */
	}

}
