// William Thing

package projects;

import java.util.Stack;

public class ReverseBits {
	
	public static void main(String[] arg) {
		print(14);
		print(9);
		print(43261596);
		print(1);
	}
	
	public static void print(int n) {
		long startTime = System.nanoTime();
		System.out.println(reverseBits(n));
		long endTime = System.nanoTime();
		//System.out.println((endTime - startTime) / Math.pow(10, 6));
		
		startTime = System.nanoTime();
		System.out.println(reverseBits2(n));
		endTime = System.nanoTime();
		//System.out.println((endTime - startTime) / Math.pow(10, 6));
	}
	
	public static int reverseBits(int n) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < 32; i++) {
			int bit = n & 1;
			s.push(bit);
			n = n >> 1;
		}
		
		int result = 0;
		int j = 0;
		while (!s.isEmpty()) {
			result += s.pop() * (int)Math.pow(2, j);
			j++;
		}
		return result;
	}
	
	public static int reverseBits2(int n) {
	     for (int i = 0; i < 16; i++) {
	        int mask1 = 1 << i;
	        int mask2 = 1 << (32 - i - 1);
	        int get1 = (mask1 & n) == 0 ? 0 : 1;
	        int get2 = (mask2 & n) == 0 ? 0 : 1;
	        if (get1 == 1) n = n | mask2;
	        else n = n & (~mask2);
	        if (get2 == 1) n = n | mask1;
	        else n = n & (~mask1);
	    }
	    return n;
	}

}


