// William Thing

/*
 * Given two 1d vectors, implement an iterator to return their elements 
 * alternately.

For example, given two 1d vectors:

v1 = [1, 2]
v2 = [3, 4, 5, 6]
By calling next repeatedly until hasNext returns false, the order of elements 
returned by next should be: [1, 3, 2, 4, 5, 6].

Follow up: What if you are given k 1d vectors? How well can your code be extended 
to such cases?

Clarification for the follow up question - Update (2015-09-18):
The "Zigzag" order is not clearly defined and is ambiguous for k > 2 cases. 
If "Zigzag" does not look right to you, replace "Zigzag" with "Cyclic". 
For example, given the following input:

[1,2,3]
[4,5,6,7]
[8,9]
It should return [1,4,8,2,5,9,3,6,7].
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class ZigZagIterator {
	Queue<Integer> q;
	int size;
	
    public ZigZagIterator(List<Integer> v1, List<Integer> v2) {
        q = new LinkedList<Integer>();
        int n1 = v1.size();
        int n2 = v2.size();
        size = n1+n2;
        int i = 0, j = 0;
        while (i < n1) {
        	q.add(v1.get(i));
        	if (j < n2) {
        		q.add(v2.get(j));
        		j++;
        	}
        	i++;
        }
        while (j < n2) {
        	q.add(v2.get(j));
        	j++;
        }
    }

    public int next() {
    	if (this.hasNext()) {
    		size--;
    		return q.remove();
    	}
    	return -1;
    }

    public boolean hasNext() {
        return size != 0;
    }
    
    // test driver
    public static void main(String[] arg) {
    	List<Integer> list1 = new LinkedList<Integer>();
    	List<Integer> list2 = new LinkedList<Integer>();
    	for (int i = 1; i < 3; i++) {
    		list1.add(i);
    	}
    	for (int j = 3; j < 7; j++) {
    		list2.add(j);
    	}
    	
    	ZigZagIterator zz = new ZigZagIterator(list1, list2);
    	while (zz.hasNext()) {
    		System.out.println(zz.next());
    	}
    }
}
