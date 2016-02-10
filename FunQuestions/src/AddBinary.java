/* William Thing
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */


public class AddBinary {
	public static void main(String[] arg) {
		System.out.println(addBinary("11", "1"));
	}
	
	public static String addBinary(String a, String b) {
		if (a == null && b == null) return "";
		if (a.length() == 0 && b.length() == 0) return "";
		StringBuilder s = new StringBuilder();
		int len1 = a.length()-1;
		int len2 = b.length()-1;
		int carryOut = 0;
		int result = 0;
		while (len1 >= 0 && len2 >= 0) {
			result = (a.charAt(len1) - '0') + (b.charAt(len2) - '0');
			System.out.println(result);
			len1--;
			len2--;
		}
		return s.toString();
	}
}
