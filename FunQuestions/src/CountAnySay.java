/* William Thing
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */

public class CountAnySay {

	public static void main(String[] arg) {
		int n = 1111444;
		System.out.println(countAnySay(n));
		System.out.println(countAnySay(1));
	}
	
	public static String countAnySay(int n) {
		char[] a = Integer.toString(n).toCharArray();
		StringBuilder result = new StringBuilder();
		int count = 1;
		char prev = 'a';
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				prev = a[i];
			} else if (prev == a[i]) {
				count++;
			} else {
				result.append(""  + count);
				result.append("" + prev);
				prev = a[i];
				count = 1;
			}
		}
		result.append("" + count);
		result.append("" + prev);
		return result.toString();
	}
}
