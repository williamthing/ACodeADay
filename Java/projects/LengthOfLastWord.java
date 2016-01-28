/*
 * William Thing
 * Given a string s consists of upper/lower-case alphabets
 * and empty space characters ' ', return the length of last 
 * word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
*/

package projects;

public class LengthOfLastWord {

	public static void main(String[] arg) {
		System.out.println(lengthOfLastWord("My name is William"));
		System.out.println(lengthOfLastWord("My name is William drive them"));
		System.out.println(lengthOfLastWord("My name is William time to play them SOON"));
		System.out.println(lengthOfLastWord("TODAY"));
		System.out.println(lengthOfLastWord("INTERESTING TIME TODAY"));
		System.out.println(lengthOfLastWord(" "));
		
		/*
		String test = "My Name is William";
		test = test.trim();
		System.out.println(test);
		*/
	}
	
	public static int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        if (s == " ") return 0;
        s = s.trim();
        String[] container = s.split(" ");
        return container[container.length - 1].trim().length();
    }
	
	// Found online solution
	public int lengthOfLastWord2(String s) {
	    s= s.trim();
	    return s.length() - 1 - s.lastIndexOf(" ");
	}
}
