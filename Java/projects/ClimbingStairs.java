/* William Thing
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

package projects;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public static void main(String[] args) {
		for (int i = 3; i < 10; i++) {
			System.out.println(climbStairs(i));
			System.out.println(climbStairs2(i));
		}

	}
	
	public static int climbStairs(int n) {
		int[] distinctWays = new int[n+1];
		return climbStairs(n, distinctWays);
	}
	
	private static int climbStairs(int n, int[] a) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (n == 2) return 2;
		if (a[n] == 0) 
			a[n] = climbStairs(n-1, a) + climbStairs(n-2, a);
		return a[n];
	}
	
	public static int climbStairs2(int n) {
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
		return climbStairs2(n, memo);
	}

	private static int climbStairs2(int n, HashMap<Integer, Integer> memo) {
	    if(n < 2) {
	        return 1;
	    }
	    if(memo.containsKey(n)) {
	        return memo.get(n);
	    }
	    int result = climbStairs(n-1) + climbStairs(n-2);
	    memo.put(n, result);
	    return result;
	}

}
