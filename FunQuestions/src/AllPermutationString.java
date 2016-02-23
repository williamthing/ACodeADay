// William Thing

import java.util.HashSet;
import java.util.Set;

public class AllPermutationString {
	public static void main(String[] arg) {
		String test = "abc";
		Set<String> set = new HashSet<String>();
		printAllPermutations("", test, set);
		System.out.println(set.toString());
		
	}
	
	public static void printAllPermutations(String word, String s) {
		if (s.length() == 0 || s == null) {
			System.out.println(word);
		} else {
			for (int i = 0; i < s.length(); i++) {
				printAllPermutations(word + s.charAt(i), s.substring(0, i) + s.substring(i+1));
			}
		}
	}

	public static void printAllPermutations(String word, String s, Set<String> set) {
		if (s.length() == 0 || s == null) {
			set.add(word);
		} else {
			for (int i = 0; i < s.length(); i++) {
				printAllPermutations(word + s.charAt(i), s.substring(0, i) + s.substring(i+1), set);
			}
		}
	}
}
