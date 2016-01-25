/*	William Thing
 * 
 * 
 * 	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

	Note:
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold 
	additional elements from nums2. The number of elements initialized in nums1 and nums2 are m 
	and n respectively.
 */


package projects;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] arg) {
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length - 4; i++) {
			arr1[i] = i + 5;
		}
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[4];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i*i - i + 2;
		}
		System.out.println(Arrays.toString(arr2));
		int m = arr1.length - 4;
		int n = arr2.length;
		mergeSortedArrays(arr1, m, arr2, n);
		
		System.out.println(Arrays.toString(arr1));
		
		
	}
	
	// 	merges two sorted arrays together
	//	TODO: need to fix a bug in the code get a array index out of bound exception
	public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;	// pointer to back of m elements in nums1
		int j = n-1;	// pointer to back of nums2
		int p = m+n-1;	// pointer to the back of nums1
		while (i >= 0 || j >= 0) {
			if (nums1[i] >= nums2[j]) {
				nums1[p] = nums1[i];
				i--;
			} else {
				nums1[p] = nums2[j];
				j--;
			}
			p--;
		}
		/*
		if (i >= 0) {
			while (i >= 0) {
				nums1[p] = nums1[i];
				i--;
				p--;
			}
		} else {
			while (j >= 0) {
				nums1[p] = nums2[j];
				j--;
				p--;
			}
		}
		*/
	}
}
