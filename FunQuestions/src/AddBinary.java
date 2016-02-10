/* William Thing
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */

public class AddBinary {
	public static void main(String[] arg) {
		System.out.println(addBinary("1", "111"));
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
			result = (a.charAt(len1) - '0') + (b.charAt(len2) - '0') + carryOut;
			System.out.println(result);
			if (result > 1) {
				carryOut = 1;
				s.append(result-2);
			} else {
				carryOut = 0;
				s.append(result);
			}
			len1--;
			len2--;
		}
		
		while (len1 >= 0) {
			result = a.charAt(len1) - '0' + carryOut;
			System.out.println(result);
			if (result > 1) {
				carryOut = 1;
				s.append(result-2);
			} else {
				carryOut = 0;
				s.append(result);
			}
			len1--;
		}
		
		while (len2 >= 0) {
			result = a.charAt(len2) - '0' + carryOut;
			System.out.println(result);
			if (result > 1) {
				carryOut = 1;
				s.append(result-2);
			} else {
				carryOut = 0;
				s.append(result);
			}
			len2--;
		}
		
		if (carryOut == 1) s.append(carryOut);
		s = s.reverse();
		return s.toString();
	}
}
