import java.util.Arrays;

// William Thing

public class GroupAnagrams {
	
	public String[] groupAnagrams(String[] words) {
		return new String[1];
	}
	
	public static void main(String[] arg) {
		String[] test = {"dog", "horse", "rhose", "god", "food", "odg", "doof", "hi"};
		Arrays.sort(test, new AnagramComparator());
		System.out.println(Arrays.toString(test));	
	}

}
