/* William Thing
 * Selection Sort
 */
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] arg) {
		int[] a = {1, 5, 3, 4, 10, 9, 8, 7, 7, 7, 2, 6};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void selectionSort(int[] a) {
		if (a==null || a.length < 2) return;
		int index;
		for (int i = 0; i < a.length-1; i++) {
			index = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[index] > a[j])
					index = j;
			}
			if (index != i && a[index] != a[i]) {
				swap(a, i, index);
			}
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
