/* William Thing
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter 
in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	
	public static void main(String[] arg) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog cat cat fish"));
		System.out.println(wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(wordPattern("abba", "dog dog dog dog"));
		System.out.println(wordPattern("bbba", "dog dog dog dog"));
		
	}

	
    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<Character, String>();
        Set<String> value = new HashSet<String>();
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
        	if (!map.containsKey(pattern.charAt(i))) {
        		if (value.contains(words[i])) {
        			return false;
        		} else {
        			map.put(pattern.charAt(i), words[i]);
        			value.add(words[i]);
        		}
        	} else {
        		if (!map.get(pattern.charAt(i)).equals(words[i])) return false;
        	}
        }
        return true;
    }
}
