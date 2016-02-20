// William Thing
// Insertion Sort
// Stable sort, similar to merge sort, unstable
// sort is quick/heap sort

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] arg) {
		int[] a = {1, 5, 3, 4, 10, 9, 8, 7, 7, 7, 2, 6};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
		
	public static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int j = i-1;
			while (j >= 0 && tmp < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = tmp;
		}
	}
		
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
