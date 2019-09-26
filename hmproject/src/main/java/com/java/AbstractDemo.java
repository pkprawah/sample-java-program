package com.java;

import java.util.ArrayList;
import java.util.List;

public class AbstractDemo {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		List<String> al = new ArrayList<>();
		al.add("pawan");
		al.add("avnish");
		al.add("ravi");
		al.add("nitesh");

		// ListIterator<String> l = al.listIterator();
		// l.remove();
		System.out.println(al);

		String str = null;
		boolean isfirst = true;
		for (String s : al) {
			if (str == null) {
				str = s.concat("a");

			} else {
				str = str + "," + s;
			}

		}

		System.out.println(str);

		try {
			animal.noise();
		} catch (Exception e) {
			System.out.println("exception in calling method ::" + e.getMessage());
		}
	}

}
