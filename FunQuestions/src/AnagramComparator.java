// William Thing

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
	
	public String charSort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public int compare(String s1, String s2) {
		return charSort(s1).compareTo(charSort(s2));
	}
}
