/* William Thing
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
*/

public class NumArray {
	int[][] numArray;

    public NumArray(int[] nums) {
        int size = nums.length;
        numArray = new int[size][size];
        for (int i = 0; i < size; i++) {
        	numArray[i][i] = nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return 0;
    }
}
