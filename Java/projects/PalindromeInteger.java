package projects;

public class PalindromeInteger {

	public static void main(String[] args) {
		int num1 = 121; // true
		int num2 = 123; // false
		int num3 = 1222222221; // true
		int num4 = 123454321; // true
		int num5 = -12345; // false
		int num6 = -567765; // true
		int num7 = 1000021; // false
		int[] a = {num1, num2, num3, num4, num5, num6, num7};
		for (int num : a) {
			System.out.println(isPal(num));
		}
		
	}
	
	// finds if a given number is a Palindrome or not
	public static boolean isPal(int n) {
		// reverse string
		// then compare
		int result = 0;
		int temp = n;
		while (temp != 0) {
			result = result * 10 + temp % 10;
			temp /= 10;
		}
		return result == n;
	}
	
	// 	finds if a given number is Palindrome or not
	// 	first solution does not work
	// 	fails at this case:
	// 	Input:
	//	1000021
	//	Output:true
	//	Expected:false
	public static boolean isPalindrome(int n) {
		if (n < 0) {
			n *= -1;
		}
		while (n > 9) {
			int right = n % 10;
			n /= 10;
			int temp = 0;
			int i = 0;
			while (n > 9) {
				temp += Math.pow(10, i) * n % 10;
				i++;
				n /= 10;
			}
			int left = n;
			if (right != left) {
				return false;
			}
			n = temp;
		}
		return true;
	}

}
