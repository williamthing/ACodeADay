/* William Thing
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
package projects;

public class RemoveNthFromEnd {

	public static void main(String[] arg) {
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		head.next.next.next.next = new LinkedListNode(5);
		printList(head);
		head = removeElement(head, 2);
		//head = removeNthFromEnd(head, 2);
		printList(head);
	}
	
	public static LinkedListNode removeNthFromEnd(LinkedListNode head, int n) {
		if (head == null) return head;
		LinkedListNode runner = head;
		LinkedListNode nthAway = head;
		LinkedListNode prev = null;
		while (runner != null && n != 0) {
			runner = runner.next;
			n--;
		}
		while (runner != null) {
			runner = runner.next;
			if (prev == null) prev = nthAway;
			else prev = prev.next;
			nthAway = nthAway.next;
		}
		if (prev == null) return head.next;
		prev.next = prev.next.next;
		return head;	
	}
	
	public static LinkedListNode removeElement(LinkedListNode head, int n) {
		LinkedListNode prev = removeElement1(head, n+1);
		if (prev == null) {
			System.out.println("HI"); 
			return head.next;
		}
		prev.next = prev.next.next;
		return head;
	}
	
	private static LinkedListNode removeElement1(LinkedListNode current, int n) {
		if (current == null) {
			return null;
		}
		LinkedListNode prev = removeElement1(current.next, n);
		n--;
		if (n == 0) {
			System.out.println("HELLO");
			return current;
		}
		return prev;
	}
	
	public static void printList(LinkedListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("/");
	}
}
