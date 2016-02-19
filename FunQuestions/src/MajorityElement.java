/* William Thing
 * 
 * Finding majority element in an array
 * 
 * for simplicity, assume element are all non-negative integers
 * and will return -1 if there is no majority element found
 * 
 * naive solution:
 * 		create a hashtable and iterate over array and keep track
 * 		of frequency of each element, then iterate over map
 * 		and see if there is any element greater than n/2
 * 		o(n) but uses o(n) space
 * 
 * another solution:
 * 		sort the given array, and then check majority element
 * 		o(nlogn)
 * 
 */

public class MajorityElement {
	
	public int findMajority(int[] a) {
		int candidate = findCandidate(a);
		return ifMajority(a, candidate);
	}
	
	public int findCandidate(int[] a) {
		int count = 0;
		int candidate = 0;
		for (int i = 0; i < a.length; ++i) {
			if (count==0) {
				candidate = a[i];
				count++;
			} else {
				if (candidate == a[i])
					count++;
				else
					count--;
			}
		}
		return candidate;
	}
	
	public int ifMajority(int[] a, int candidate) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (candidate == a[i]) count++;
		}
		return (count > a.length/2) ? candidate : -1;
	}
	
	public static void main(String[] arg) {
		MajorityElement me = new MajorityElement();
		int[] a = {1, 1, 1, 1, 1};						// 1
		int[] b = {1, 7, 1, 7, 7};						// 7
		int[] c = {1, 2, 3, 4, 5, 6, 7, 8};				// -1
		int[] d = {55, 55, 1, 2, 55, 55, 55, 55};		// 55
		int[][] y = {a, b, c, d};
		for (int[] x : y) {
			System.out.println(me.findMajority(x));
		}
	}
}
