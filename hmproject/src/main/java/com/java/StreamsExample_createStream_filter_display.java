package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample_createStream_filter_display {

	public static void main(String[] args) {
		
		 List<String> StringList = new ArrayList<>();
		 StringList.add("ank");
		 StringList.add("sam");
		 StringList.add("az");
		StringList.add("neh");
		 StringList.add("ad");
		 Stream<String> stream = StringList.stream(); // Convert list (ArrayList) of String to stream
		 // In one line display all records that start with 'a' in stream
		 System.out.println("1. Use stream for filtering and display");
		 stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		 .forEach(System.out::println); // Displays  - ank, az, ad
		 //OR
		 stream = StringList.stream();
		 System.out.println("\n2.Use stream for filtering and display");
		 stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		 .forEach(s -> System.out.println("value = " + s)); // Displays  - value = ank, value = az, value = ad
		
		 //OR
		 
		 stream = StringList.stream();
		 System.out.println("\n3.Use stream for filtering and display");
		 stream. forEach(s -> {
			 if (s.startsWith("a")) // Filter all record which starts with "a"
			 System.out.println(s);
		 });// Displays - value = ank, value = az, value = ad
				 
		           
		           
/*		           //streams can't be used again, hence create new stream again
		           //java.lang.IllegalStateException: stream has already been operated upon or closed
		 stream = StringList.stream(); // Convert list (ArrayList) to stream
		           // In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stream
		           System.out.println("\n4.Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )");
		           stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		                  .sorted()  //SORT the list (ASCENDING order)
		                  .forEach(System.out::println); // Displays - ad, ank, az
		 
		           stream = StringList.stream();
		           // In one line display all records (in sorted manner - DESCENDING - by passing Lambda expression) that start with 'a' in stream
		           System.out.println("\n5.Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
		           stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		                  .sorted((a, b) -> b.compareTo(a))  //SORT the list (DESCENDING order - by passing Lambda expression)
		                  .forEach(System.out::println); // Displays - az, ank, ad
		           
		 
		           stream = StringList.stream();
		           // In one line display all records (in sorted manner - DESCENDING -  - by using Comparator.reverseOrder()) that start with 'a' in stream
		           System.out.println("\n6.Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
		           stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		                  .sorted(Comparator.reverseOrder())  //SORT the list (DESCENDING order - by using Comparator.reverseOrder())
		                  .forEach(System.out::println); // Displays - az, ank, ad
		           
		           stream = StringList.stream();
		           // In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stream
		           System.out.println("\n7.Use stream for filtering, UPPERCASE conevrsion, sorting and display");
		           stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		                  .map((s) -> s.toUpperCase()) //CONVERT to UPPERCASE
		                  .sorted()  //SORT the list (ASCENDING order)
		                  .forEach(System.out::println);  // Displays - AD, ANK, AZ
		 
		           //OR
		           stream = StringList.stream();
		           // In one line display all records (in sorted manner) in UPPERCASE that start with 'a' in stream
		           System.out.println("\n8.Use stream for filtering, UPPERCASE conversion, sorting and display");
		 
		           stream.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
		                  .map(String::toUpperCase) //CONVERT to UPPERCASE
		                  .sorted()  //SORT the list (ASCENDING order)
		                  .forEach(System.out::println);  // Displays - AD, ANK, AZ
*/
	}

}
