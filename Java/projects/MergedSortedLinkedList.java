/*	William Thing
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes 
 * of the first two lists.
 * 
 */

package projects;

public class MergedSortedLinkedList {
	
	public static void main(String[] arg) {
		LinkedListNode list1 = new LinkedListNode(2);
		list1.next = new LinkedListNode(7);
		list1.next.next = new LinkedListNode(8);
		list1.next.next.next = new LinkedListNode(10);
		
		LinkedListNode list2 = new LinkedListNode(4);
		list2.next = new LinkedListNode(5);
		list2.next.next = new LinkedListNode(6);
		list2.next.next.next = new LinkedListNode(8);
		
		printList(list1);
		printList(list2);
		
		LinkedListNode result = mergeSortedList(list1, list2);
		
		printList(result);
		
	}
	
	//	merging two given sorted linkedlist
	public static LinkedListNode mergeSortedList(LinkedListNode L1, LinkedListNode L2) {
		// both list are empty
		if (L1 == null && L2 == null) return null;
		// either list is empty, so return the other
		if (L1 == null) return L2;
		if (L2 == null) return L1;
		
		LinkedListNode list;
		if (L1.data <= L2.data) {
			list = L1;
			L1 = L1.next;
		} else {
			list = L2;
			L2 = L2.next;
		}
		
		LinkedListNode current = list;
		while (L1 != null && L2 != null) {
			if (L1.data <= L2.data) {
				current.next = L1;
				L1 = L1.next;
			} else {
				current.next = L2;
				L2 = L2.next;
			}
			current = current.next;
		}
		if (L1 == null) current.next = L2;
		else current.next = L1;
		
		return list;
	}
	
	// prints list
	public static void printList(LinkedListNode current) {
		if (current != null) {
			System.out.print(current.data);
			System.out.print("->");
			printList(current.next);
		} else {
			System.out.println("/");
		}
	}

}
