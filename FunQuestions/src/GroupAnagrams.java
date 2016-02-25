// William Thing

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {
		
	public void groupAnagrams(String[] words) {
		HashMap<String, ArrayList<String>> mapList = new HashMap<String, ArrayList<String>>();
		for (String word : words) {
			String key = sortChar(word);
			if (!mapList.containsKey(key)) {
				ArrayList<String> temp1 = new ArrayList<String>();
				temp1.add(word);
				mapList.put(key, temp1);
			} else {
				ArrayList<String> temp2 = mapList.get(key);
				temp2.add(word);
				mapList.put(key, temp2);
			}
		}
		ArrayList<String> group = new ArrayList<String>();
		for (String key : mapList.keySet()) {
			group.addAll(mapList.get(key));
		}
		group.toArray(words);
	}
	
	// sort char
	public String sortChar(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static void main(String[] arg) {
		String[] test = {"dog", "horse", "rhose", "god", "food", "odg", "doof", "hi"};
		String[] test2 = {"dog", "horse", "rhose", "god", "food", "odg", "doof", "hi"};
		Arrays.sort(test, new AnagramComparator());
		System.out.println(Arrays.toString(test));
		GroupAnagrams ga = new GroupAnagrams();
		ga.groupAnagrams(test2);
		System.out.println(Arrays.toString(test2));
	}
}
