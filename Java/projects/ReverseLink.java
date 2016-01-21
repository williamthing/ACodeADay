/*
 * William Thing
 * 
 * 
 * Reversing a Linked List
 */
package projects;

public class ReverseLink {
	
	public static void main(String[] arg) {
		LinkedListNode front = new LinkedListNode(0);
		LinkedListNode current = front;
		for (int i = 1; i <= 7; i++) {
			current.next = new LinkedListNode(i);
			current = current.next;
		}
		printList(front);
		long startTime = System.nanoTime();
		front = reverseList(front);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) / Math.pow(10, 6));
		printList(front);
		startTime = System.nanoTime();
		front = reverseList2(front);
		endTime = System.nanoTime();
		System.out.println((endTime - startTime) / Math.pow(10, 6));
		printList(front);
			
	}
	
	// prints a given linked list with spaces in between its data
	public static void printList(LinkedListNode front) {
		printListHelper(front);
		System.out.println();
	}
	
	// prints a given linked list with spaces in between its data
	private static void printListHelper(LinkedListNode front) {
		LinkedListNode current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	// Returns a given linked list in reversed order
	// TODO: refactor code (one case not necessary to check)
	public static LinkedListNode reverseList(LinkedListNode front) {
		// either front is null or next is null then nothing to reverse
		if (front == null || front.next == null) {
			return front;
		}
		// We know we have 2 linked list LinkedListNodes at least
		LinkedListNode second = front.next;
		LinkedListNode third = second.next;
		front.next = null;
		if (third == null) {
			second.next = front;
			return second;
		}
		
		second.next = front;
		front = third;
		third = front.next;
		front.next = second;
		while (third != null) {
			second = third;
			third = third.next;
			second.next = front;
			front = second;
		}
		return front;
	}
	
	// Solution Found Online
	public static LinkedListNode reverseList2(LinkedListNode node) {
	    if (node == null || node.next == null) {
	        return node;
	    }
	    LinkedListNode currentNode = node;
	    LinkedListNode previousNode = null;
	    LinkedListNode nextNode = null;

	    while (currentNode != null) {
	        nextNode = currentNode.next;
	        currentNode.next = previousNode;
	        previousNode = currentNode;
	        currentNode = nextNode;
	    }
	    return previousNode;
	}
}
