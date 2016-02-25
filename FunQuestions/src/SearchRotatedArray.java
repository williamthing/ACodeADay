// William Thing


public class SearchRotatedArray {
	public static void main(String[] arg) {
		
	}
	
	public static int searchRotatedArray(int[] a, int n) {
		if (a==null || a.length==0) {
			return -1;
		}
		int start = 0;
		int end = a.length-1;
		int mid;
		while (start <= end) {
			mid = (end-start)/2 + start;
			if (a[mid]==n) return mid;
			if (a[start] < a[mid]) {
				if (a[start] <= n && a[mid] >= n)
					end = mid-1;
				else {
					start = mid+1;
				}
			} else if (a[mid] < a[end]) {
				if (a[mid] <= n && a[end] >= n) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		
		return 0;
	}
}
