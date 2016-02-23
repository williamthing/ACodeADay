// William Thing
// Wiggle Sort

/*
 * Given an unsorted array nums, reorder 
 * it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer 
is [1, 6, 2, 5, 3, 4].
 */

public class WiggleSort {

	public static void main(String[] arg) {
		int[] test = {3, 5, 2, 1, 6, 4};
		
	}
	
	public static void wiggleSort(int[] a) {
		for (int i = 0; i < a.length-2; i++) {
			int tmp = a[i];
			// even are lower values
			// odds are the higher values
			if (i % 2 == 0) {
				findMin(a, i+1, a.length-1, tmp);
			} else {
				findMax(a, i+1, a.length-1, tmp);
			}
		}
	}
	
	public static void findMin(int[] a, int start, int end, int val) {
		
	}
	
	public static void findMax(int[] a, int start, int end) {
		
	}
}
