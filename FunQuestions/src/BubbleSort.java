/* William Thing
 * Bubble Sort
 */
import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] arg) {
		int[] a = {1, 3, 4, 2, 6, 5};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubbleSort(int[] a) {
		int n = a.length;
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (a[i-1] > a[i]) {
					swap(a, i-1, i);
					swapped = true;
				}
			}
			n--;
		}
	}

	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
