package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		lines.stream().filter(FilterDemo::isNotSpring).collect(Collectors.toList()).forEach(System.out::println);;
		
		List<Integer> intlist=Arrays.asList(1,2,3,4,5,6,7);
		sumStream(intlist);
		
		
		/*Supplier < Person > supplier = () - > 
		{
            return new Person("Varun", 30, "Programmer");
        }*/
        //Person p = supplier.get();
        //System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());
	
	
	}

	private static boolean isNotSpring(String name) {
		
		return !name.equals("spring");
	}
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		
	}

}
