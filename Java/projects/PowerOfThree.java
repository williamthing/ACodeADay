/*	William Thing
 * 	Given an integer, write a function to determine if it is a power of three.

	Follow up:
	Could you do it without using any loop / recursion?
 */

package projects;

import java.util.ArrayList;
import java.util.List;

public class PowerOfThree {
	
	public static void main(String[] arg) {
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			nums.add((int)Math.pow(3, i));
		}
		for (int num : nums)
			System.out.println(isPowerOfThree(num));
	}
	
	//	solution found online, my brute force method was similiar to this but
	//	instead of going top down, was going bottom up
	public static boolean isPowerOfThree(int n) {
	    if(n<=0) return false;
	    if(n==1) return true;
	    if(n%3==0){
	        return isPowerOfThree(n/3);
	    }
	    return false;
	}
}
