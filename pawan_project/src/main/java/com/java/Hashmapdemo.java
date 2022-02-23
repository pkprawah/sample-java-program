package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Hashmapdemo {

	public static void main(String[] args) {

		Map<Integer, Integer> hashmap = new HashMap<>();
		String queryType[] = { "insert", "insert", "addToValue", "addToKey", "get" };
		int query[][] = { { 1, 2 }, { 2, 3 }, { 2 }, { 1 }, { 3 } };

		int insertTemp[] = new int[2];
		int addToValue[] = new int[1];
		int addToKey[] = new int[1];
		int getKey[] = new int[1];
		int length = queryType.length;
		int k, v, result;

		for (int i = 0; i < length; i++) {
			for (int j = i; j <= i; j++) {
				if (queryType[i].equalsIgnoreCase("insert")) {
					insertTemp = query[j];
					hashmap.put(insertTemp[0], insertTemp[1]);
					break;
				}

				else if (queryType[i].equalsIgnoreCase("addToValue")) {
					addToValue = query[j];
					for (Entry<Integer, Integer> entry : hashmap.entrySet()) {
						k = entry.getKey();
						v = entry.getValue() + addToValue[0];
						hashmap.put(k, v);

					}
					System.out.println(hashmap);
					break;
				}

				else if (queryType[i].equalsIgnoreCase("addToKey")) {
					addToKey = query[j];
					System.out.println(" addtokey " + addToKey[0]);
					TreeSet<Integer> ketSet = new TreeSet<Integer>(hashmap.keySet());
					System.out.println(" TreeSet<Integer> ketSet " + ketSet);
					ArrayList<Integer> hSet = new ArrayList<>(ketSet);
					for (int a = hSet.size() - 1; a >= 0; a--) {
						int key = hSet.get(a);
						int value = hashmap.get(key);
						System.out.println("Value " + value);
						hashmap.put(key + addToKey[0], value);
						System.out.println(hashmap);
					}

					break;
				}

				else {

					getKey = query[j];
					result = hashmap.get(getKey[0]);
					System.out.println(result);
					break;
				}

			}
		}

	}

}
