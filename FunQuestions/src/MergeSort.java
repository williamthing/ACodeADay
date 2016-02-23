// Will T
import java.util.Arrays;

public class MergeSort {
	
	public void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = (start+end)/2;  //(end-start)/2 + start;
			mergeSort(array, start, mid);
			mergeSort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
	
	public void merge(int[] a, int start, int mid, int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int[] temp1 = new int[n1];
		int[] temp2 = new int[n2];
		
		// copy original array to temps
		for (int i = 0; i < n1; i++)
			temp1[i] = a[start+i];
		
		for (int j = 0; j < n2; j++)
			temp2[j] = a[mid+1+j];
		
		int i = 0, j = 0, k = start;
		while (i < n1 && j < n2) {
			if (temp1[i] <= temp2[j]) {
				a[k] = temp1[i];
				i++;
			} else {
				a[k] = temp2[j];
				j++;
			}
			k++;
		}
		
		while (i < n1) {
			a[k] = temp1[i];
			k++;
			i++;
		}
		
		while (j < n2) {
			a[k] = temp2[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String[] arg) {
		int[] a = {1, 5, 3, 4, 10, 9, 8, 7, 7, 7, 2, 6};
		int[] b = {9,8,7,6,5,4,3,2,1};
		int[] c = {1,2,3,4,5,6};
		int[][] d = {a,b,c};
		MergeSort ms = new MergeSort();
		for (int[] x : d) {
			ms.mergeSort(x, 0, x.length - 1);
			System.out.println(Arrays.toString(x));
		}
	}
}
