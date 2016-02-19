/* William Thing
 * 
 * Finding majority element in an array
 * 
 * for simplicity, assume element are all non-negative integers
 * and will return -1 if there is no majority element found
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

}
