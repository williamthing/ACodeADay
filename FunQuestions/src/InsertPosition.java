// William Thing
/*
 * Given a sorted array and a target value, return the index if 
 * the target is found. If not, return the index where it would 
 * be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */

public class InsertPosition {

    public int searchInsert(int[] nums, int target) {
    	int start = 0;
    	int end = nums.length-1;
    	while (start <= end) {
    		int mid = (end+start)/2;
    		if (nums[mid] > target) {
    			end = mid-1;
    		} else if (nums[mid] < target) {
    			start = mid+1;
    		} else {
    			return mid;
    		}
    	}
    	return start;
    }
    
    public static void main(String[] arg) {
    	int[] a = {1,3,5,6};
    	int[] test = {5, 2, 7, 0};
    	int[] ans = {2, 1, 4, 0};
    	
    	InsertPosition IP = new InsertPosition();

    	for (int i = 0; i < test.length; i++) {
    		System.out.println(IP.searchInsert(a, test[i]));
    	}
    }
}
