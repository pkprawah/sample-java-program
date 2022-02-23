package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class List2MapDemo {

	public static void main(String[] args) {
		
		List<String> hostingProviders = Arrays.asList("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");
		System.out.println("list: " + hostingProviders); 
		Map<String, Integer> cards2Length = hostingProviders.stream() 
				.collect(Collectors.toMap(Function.identity(), 
						String::length, (e1, e2) -> e1)); 
		System.out.println("map: " + cards2Length);

		
		
		String s = "Pawankumar";
		Map<Character, Integer> freqs = new HashMap<>();
		for (char c : s.toCharArray()) {
		    freqs.merge(c,                  // key = char
		                1,                  // value to merge
		                Integer::sum);      // counting
		}
		System.out.println("Frequencies:\n" + freqs);
		
		
		
		String str = "abcaba";
		Map<Character, Integer> frequencies = str.chars().boxed()
		        .collect(Collectors.toMap(
		                // key = char
		                k ->Character.valueOf((char) k.intValue()),
		                v -> 1,         // 1 occurence
		                Integer::sum)); // counting
		System.out.println("Frequencies using java 8:\n" + frequencies);
		
		
		
		Map<Character,Long> map = s.chars().mapToObj(i->(char)i)
                .collect(Collectors
                           .groupingBy(e -> e,
                              Collectors.counting()));
System.out.println("GroupingBy::"+map);
		
	}

}
