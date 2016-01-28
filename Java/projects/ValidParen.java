/* William Thing
 * 
 * Given a string containing just the characters 
 * 
 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all 
valid but "(]" and "([)]" are not.
 */

package projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParen {
	
	public static void main(String[] arg) {
		System.out.println(isValid("()[]{}"));	// true
		System.out.println(isValid("()"));		// true
		System.out.println(isValid("(]"));		// false
		System.out.println(isValid("([)]"));	// false
		System.out.println(isValid(")}{({))[{{[}"));	// false
		System.out.println(isValid("([])"));			// true
		System.out.println(isValid("(()"));			// false
		

	}
	
	public static boolean isValid(String s) {
		if (s.length() % 2 != 0) return false;
		Stack<Character> otherPair = new Stack<Character>();
		Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
		for (int i = 0; i < s.length(); i++) {
			if (!pairs.containsKey(s.charAt(i)) && otherPair.isEmpty()) return false;
			else if (!pairs.containsKey(s.charAt(i))) {
				char matchingPair = otherPair.pop();
				if (matchingPair != s.charAt(i)) return false;
			} else {
				otherPair.push(pairs.get(s.charAt(i)));
			}
		}
		if (!otherPair.isEmpty()) return false;
		return true;	
	}
	
	// solution that does not consider ([]) a true valid input and will return false
	public static boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put('{', '}');
        pairs.put('(', ')');
        pairs.put('[', ']');
        boolean reset = true;
        char prev = 'a';
        for (int i = 0; i < s.length(); i++) {
        	if (reset) {
        		prev = s.charAt(i);
        	} else {
        		if (!pairs.containsKey(prev)) return false;
        		if (s.charAt(i) != pairs.get(prev)) return false;
        	}
        	reset = !reset;
        }
        return true;  
    }
	
}
