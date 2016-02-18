/* William Thing
 * 
 * String Calculator
 */
public class StringCalculator {

	public static void main(String[] arg) {
		String a = "3+5*7-5";	// 51
		String b = "364-364+7"; // 7
		int result = calculateString(a);
		System.out.println(result);
		result = calculateString(b);
		System.out.println(result);
	}
	
	public static int calculateString(String s) {
		if (s.length() == 0 || s==null) return -1;
		char[] cA = s.toCharArray();
		int start = 0, result = 0, tmp = 0;
		while (Character.isDigit(cA[start]) && start < cA.length) {
			tmp = tmp * 10 + Character.getNumericValue(cA[start++]);
		}
		result = tmp;
		char operand = 'c';
		while (start < cA.length) {
			// get next operand
			if (start < cA.length && !Character.isDigit(cA[start])) {
				operand = cA[start++];
			}
			// get next val
			tmp = 0;
			while (start < cA.length && Character.isDigit(cA[start])) {
				tmp = tmp * 10 + Character.getNumericValue(cA[start++]);
			}
			// cal next val with operand into result
			result = compute(result, tmp, operand);
		}
		return result;
	}
	
	public static int compute(int result, int next, char operand) {
		if (operand == '*') return result * next;
		if (operand == '-') return result - next;
		if (operand == '+') return result + next;
		if (operand == '/') return result / next;
		else return result;
	}
}
