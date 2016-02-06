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
import java.util.HashMap;
import java.util.Map;

public class NumArray {
	private int[] numArray;
	private Map<Integer, Integer> sums;

    public NumArray(int[] nums) {
        int size = nums.length;
        numArray = new int[size];
        sums = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
        	numArray[i] = nums[i];
        }

    }

    public int sumRange(int i, int j) {
        if (i == j) return sums.get(i+j);
        return 0;
        
    }
}
