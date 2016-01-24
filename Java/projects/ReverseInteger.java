/*
 * 	William Thing 
 * 	Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
 */

package projects;

public class ReverseInteger {

	public static void main(String[] args) {
		int num1 = 321;
		int num2 = -123;
		int num3 = 12345;
		int[] a = {num1, num2, num3};
		for (int num : a) {
			System.out.println(reverseInt(num));
		}
	}
	
	//	reverses a given integer
	public static int reverseInt(int num) {
		int result = 0;
		while (num != 0) {
			result = (result * 10) + num % 10;
			num /= 10;
		}
		return result;
	}

}
