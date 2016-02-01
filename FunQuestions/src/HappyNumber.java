/* William Thing
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
import java.util.Arrays;

public class HappyNumber {
	public static void main(String[] arg) {
		System.out.println(isHappyNumber(19));
		
	}
	
	public static boolean isHappyNumber(int n) {
		if (n == 1) return true;
		int[] a = new int[810];
		if (n < 810) a[n]++;
		int result;
		while (n != 1) {
			result = 0;
			while (n != 0) {
				result += (n%10) * (n%10);
				n /= 10;
			}
			n = result;
			a[n]++;
			if (a[n] > 1) return false;
		}
		return true;
	}
}
