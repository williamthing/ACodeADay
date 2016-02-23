// William Thing

public class AllPermutationString {
	public static void main(String[] arg) {
		String test = "aabc";
		printAllPermutations("", test);
		
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
}
