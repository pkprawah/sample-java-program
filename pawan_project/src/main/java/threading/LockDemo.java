package threading;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class LockDemo {
	public static void main(String ar[]) {
		ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();

		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		map.put("6", "six");
		map.put("7", "seven");
		map.put("8", "eight");
		map.put("9", "nine");
		System.out.print(map);
		ConcurrentNavigableMap<String, String> headMap = map.headMap("5");
		System.out.println(headMap);
	}
}
