/*
 * William Thing
 * Reverse Linked List
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
		reverseList(front);
		printList(front);
			
	}
	
	public static void printList(LinkedListNode front) {
		LinkedListNode current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	public static LinkedListNode reverseList(LinkedListNode front) {
		// either front is null or next is null then nothing to reverse
		if (front == null || front.next == null) {
			return front;
		}
		LinkedListNode last = front;
		front = front.next;
		while (front != null) {
			LinkedListNode tmp = front;
			front = front.next;
			tmp.next = last;
			last = tmp;
		}
		return last;
	}
}
