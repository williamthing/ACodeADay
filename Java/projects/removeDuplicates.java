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
			System.out.println(removeDuplicates(a));
		}

		
	}
	
	public static int removeDup(int[] sortedA) {
		int runner = 0;
		int newLen = 0;
		for (int i = 0; i < sortedA.length; i++) {
			if (runner == sortedA.length - 1) {
				System.out.println("HELLO");
				break;
			}
			while (runner < sortedA.length && sortedA[i] == sortedA[runner]) {
				runner++;
			}
			System.out.println("TEST " + runner);
			if (i >= sortedA.length) {
				break;
			}
			i++;
			sortedA[i] = sortedA[runner];
			newLen = i;
			
		}
		return newLen;
	}
	
	public static int removeDuplicates(int[] a) {
		int runner = 1;
		for (int i = 1; i < a.length; i++) {
			while (a[i-1] == a[runner]) {
				runner++;
			}
			a[i] = a[runner];
			runner++;
			if (runner >= a.length) {
				return i+1;
			}
		}
		return a.length;
	}
}
