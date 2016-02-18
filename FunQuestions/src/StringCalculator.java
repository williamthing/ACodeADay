/* William Thing
 * 
 * String Calculator
 * 
 * not following PEMDAS, calculates values first seen from left to right
 */
public class StringCalculator {
	
	// Takes a given string and calculates the result as if the string 
	// was an equation does not follow paradigm of PEMDAS, only the 
	// values first seen from left to right
	// returns negative max integer if given null string or blank string
	public int calculateString(String s) {
		if (s.length()==0 || s==null) return -1*Integer.MAX_VALUE;
		char[] cA = s.toCharArray();
		int start = 0, result = 0, tmp = 0;
		while (start < cA.length && Character.isDigit(cA[start])) {
			tmp = tmp * 10 + Character.getNumericValue(cA[start++]);
		}
		result = tmp;
		char operand = 'c';
		while (start < cA.length) {
			// get next operand
			if (!Character.isDigit(cA[start])) {
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
	
	// returns result of two given values and a char operand
	// matching the necessary computation by that given operand
	// return given result if none of the operand match
	public int compute(int result, int next, char operand) {
		if (operand == '*') return result * next;
		if (operand == '-') return result - next;
		if (operand == '+') return result + next;
		if (operand == '/') return result / next;
		else return result;
	}
	
	// test driver
	public static void main(String[] arg) {
		String a = "3+5*7-5";	// 51
		String b = "364-364+7"; // 7
		String c = "1+2+3*6"; 	// 36
		StringCalculator calculator = new StringCalculator();
		int result = calculator.calculateString(a);
		System.out.println(result);
		result = calculator.calculateString(b);
		System.out.println(result);
		result = calculator.calculateString(c);
		System.out.println(result);
	}
}
