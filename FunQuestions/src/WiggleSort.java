// William Thing
// Wiggle Sort

/*
 * Given an unsorted array nums, reorder 
 * it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

For example, given nums = [3, 5, 2, 1, 6, 4], one possible answer 
is [1, 6, 2, 5, 3, 4].
 */

import java.util.Arrays;

public class WiggleSort {

	public static void main(String[] arg) {
		int[] test2 = {3, 5, 2, 1, 6, 4};
		int[] test = {1, 2};
		fastWiggleSort(test);
		System.out.println(Arrays.toString(test));
	}
	
	public static void fastWiggleSort(int[] a) {
		Arrays.sort(a);
		if (a.length <= 2)
			return;
		for (int i = 0; i < (a.length-1)/2; i++) {
			int tmp = a[i*2+1];
			a[i*2+1] = a[i*2+2];
			a[i*2+2] = tmp;
		}
	}
	
	public static void wiggleSort(int[] a) {
		if (a == null || a.length < 2) return;
		if (a.length == 2) {
			if (a[0] > a[1]) swap(a, 0, 1);
		}
		for (int i = 0; i < a.length-1; i++) {
			// even are lower values
			// odds are the higher values
			if (i % 2 == 0) {
				findMin(a, i+1, a.length-1, i);
			} else {
				findMax(a, i+1, a.length-1, i);
			}
		}
	}
	
	public static void findMin(int[] a, int start, int end, int index) {
		int minIndex = index;
		for (int i = start; i <= end; i++) {
			if (a[minIndex] > a[i])
				minIndex = i;
		}
		swap(a, index, minIndex);
	}
	
	public static void findMax(int[] a, int start, int end, int index) {
		int maxIndex = index;
		for (int i = start; i <= end; i++) {
			if (a[maxIndex] < a[i])
				maxIndex = i;
		}
		swap(a, index, maxIndex);
	}
	
	// swap
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
