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
		String[] sTest = {"egg", "foo", "paper", "aa", "ab"};
		String[] tTest = {"add", "bar", "title", "ab", "aa"};
		for (int i = 0; i < sTest.length; i++) {
			System.out.println(isIsomorphic(sTest[i], tTest[i]));
		}	
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		Map<Character, Character> isomorphicPair1 = new HashMap<Character, Character>();
		Map<Character, Character> isomorphicPair2 = new HashMap<Character, Character>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!isomorphicPair1.containsKey(charArray[i])) {
				// s char is not found yet, but t char is linked already
				if (isomorphicPair2.containsKey(t.charAt(i))) return false;
				isomorphicPair1.put(charArray[i], t.charAt(i));
				isomorphicPair2.put(t.charAt(i), charArray[i]);
			} else {
				// s char is found, but t char not found yet then linked to another or same
				if (!isomorphicPair2.containsKey(t.charAt(i))) return false;
				if (isomorphicPair1.get(charArray[i]) != t.charAt(i)) return false;
				if (isomorphicPair2.get(t.charAt(i)) != charArray[i]) return false;
			}
		}
		return true;
	}
}
