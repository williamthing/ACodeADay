package projects;

import java.util.Arrays;

public class MedianOfTwoArrays {
	
	public static void main(String[] args) {
		// size 7
		int[] a = {1, 3, 4, 5, 5, 7, 11};
		// size 7
		int[] b = {4, 5, 6, 9, 22, 50, 50};
		int median = findMedian(a, b);
		System.out.println(median);
	}
	
	
	/*
	 * both are even so median is in between
	 * one is even and one is odd so median is adding two "midpoints" divide by 2
	 * both odd, midpoint is in the middle
	 */
	public static int findMedian(int[] a, int[] b) {
		int fullSize = a.length + b.length;
		int half = fullSize / 2;
		int i = 1, p1 = 0, p2 = 0;
		while (i < half) {
			if (a[p1] <= b[p2]) {
				p1++;
			} else {
				p2++;
			}
			i++;
		}
		int median;
		System.out.println(p1 + " " + p2);
		if (a[p1] <= b[p2]) {
			median = a[p1];
			p1++;
		} else {
			median = b[p2];
			p2++;
		}
		System.out.println(p1 + " " + p2);
		if (fullSize % 2 == 0) {
			return median;
		}
		int next;
		if (a[p1] <= b[p2]) {
			next = a[p1];
		} else {
			next = b[p1];
		}
		return (median + next) / 2;
	}

}
