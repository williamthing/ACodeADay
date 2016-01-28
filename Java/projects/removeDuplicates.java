package projects;

/*
 * William Thing
 * 1/20/16
 * 
 * Given a sorted array, remove the duplicates in place such that each element 
 * appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with 
constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums 
being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

import java.util.Arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] a2 = {1,1,1,1,3};
		int[] a3 = {1};
		int[] a4 = {1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 5};
		int[][] arr = {a1, a2, a3, a4};
		
		for (int[] a : arr) {
			long startTime = System.nanoTime();
			System.out.println(removeDuplicates(a));
			long endTime = System.nanoTime();
			System.out.println((endTime - startTime) / Math.pow(10, 6));
			
			
			startTime = System.nanoTime();
			System.out.println(removeDuplicates2(a));
			endTime = System.nanoTime();
			System.out.println((endTime - startTime) / Math.pow(10, 6));
		}

		
	}
	
	//	pre: assume given array is sorted
	//	post: removes all duplicates from array and gives new size from removing them.
	//		  previous data may still exist but the length is given to ignore them if
	//		  new len < previous data
	public static int removeDuplicates(int[] a) {
		int size = a.length;
		if (size <= 1) return size;
		if (size == 2) {
			if (a[0] == a[1]) return 1;
			else return 2;
		}
		int prev = 0;
		int curr = 1;
		int runner = 1;
		while (runner < size) {
			if (a[prev] != a[runner]) {
				a[curr] = a[runner];
				prev++;
				curr++;
			}
			runner++;
		}
		return curr;
	}
	
	//	solution found online
	// 	does not seem correct
    public static int removeDuplicates2(int[] nums) {
        if (nums.length <= 1) { return 1; }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }
}
