// William Thing

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;

public class LinkedHashM {
	
	public static void main(String[] arg) {
		Map<String, Integer> linkedmap = new LinkedHashMap<String, Integer>();
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		String[] test = {"William", "Angie", "best", "love", "flowers"};
		for (String s : test) {
			linkedmap.put(s, s.length());
			hashmap.put(s, s.length());
		}
		for (String key : linkedmap.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		for (String key : hashmap.keySet()) {
			System.out.print(key + " ");
		}
	}
}
