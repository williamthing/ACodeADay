/* William Thing
 * 
You are a professional robber planning to rob houses along a 
street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them 
is that adjacent houses have security system connected and 
it will automatically contact the police if two adjacent 
houses were broken into on the same night.

Given a list of non-negative integers representing the 
amount of money of each house, determine the maximum amount 
of money you can rob tonight without alerting the police.
 */


public class HouseRobber {
	public static void main(String[] arg) {
		int[] a = {1, 2, 3, 4, 5, 6};
		System.out.println(rob(a));
		
	}
	
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else if (nums.length == 2) return Math.max(nums[0], nums[1]);
        else {
            int[] rob = new int[nums.length];
            rob[0] = nums[0];
            rob[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++)
                rob[i] = Math.max(nums[i] + rob[i-2], rob[i-1]);
            return rob[nums.length-1];
        }
    }
}
