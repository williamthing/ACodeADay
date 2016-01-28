/* William Thing
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

package projects;

public class ClimbingStairs {

	public static void main(String[] args) {
		for (int i = 3; i < 10; i++) {
			System.out.println(climbStairs(i));
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

}
