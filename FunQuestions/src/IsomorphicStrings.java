/* William Thing
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map to 
the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	public static void main(String[] arg) {
		String[] sTest = {"egg", "foo", "paper"};
		String[] tTest = {"add", "bar", "title"};
		for (int i = 0; i < sTest.length; i++) {
			System.out.println(isIsomorphic(sTest[i], tTest[i]));
		}	
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		Map<Character, Character> isomorphicPair = new HashMap<Character, Character>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!isomorphicPair.containsKey(charArray[i])) {
				isomorphicPair.put(charArray[i], t.charAt(i));
			} else {
				if (isomorphicPair.get(charArray[i]) != t.charAt(i)) return false;
			}
		}
		return true;
	}

}
