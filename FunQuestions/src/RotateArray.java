/* William Thing
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array 

[1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are 
at least 3 different ways to solve this problem.
 */


public class RotateArray {
	
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		//int[] arr = {1, 2};
		rotate(arr, 4);
		for (int n : arr) {
			System.out.print(n);
		}
	}
	
	/*
    public static void rotate(int[] nums, int k) {
    	if (nums == null || nums.length == 1 || k == 0 || k >= nums.length) return;
    	int i = k, j = 0, tmp;
        do {
        	System.out.println(i + " " + j);
        	tmp = nums[i];
        	nums[i++] = nums[j];
        	nums[j++] = tmp;
        	if (i == nums.length) i = 0;
        	if (j >= k) j = 0;
        } while (i != k-1);
    }
    */
	
	public static void rotate(int[] a, int rotate) {
		rotateA(a, rotate, 0, rotate-1);
	}
	
	private static void rotateA(int[] a, int rotate, int start, int end) {
		if ((end % a.length) != rotate-2) {
			swap(a, (end % a.length), start % (rotate-1));
			rotateA(a, rotate, start+1, end+1);
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
