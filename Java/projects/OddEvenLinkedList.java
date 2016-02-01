/*
 * William Thing
 * 
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input. 
The first node is considered odd, the second node even and so on ...


 */

package projects;

public class OddEvenLinkedList {
	
	public static void main(String[] arg) {
		// Creating test cases
		LinkedListNode l1 = null;
		printList(l1);
		LinkedListNode l2 = new LinkedListNode(10);
		printList(l2);
		LinkedListNode l3 = new LinkedListNode(15);
		printList(l3);
		LinkedListNode l4 = new LinkedListNode(22);
		printList(l4);
		l3.next = l4;
		printList(l3);
		l4.next = l2;
		printList(l3);
		l2.next = new LinkedListNode(17);
		printList(l3);
		l2.next.next = new LinkedListNode(18);
		printList(l3);
		l2.next.next = new LinkedListNode(33);
		printList(l3);
		
		l3 = oddEvenList(l3);
		printList(l3);
	
	}
	
	public static LinkedListNode oddEvenList(LinkedListNode head) {
		if (head == null || head.next == null || head.next.next == null) return head;
		LinkedListNode evens = head.next;
		LinkedListNode currEvens = evens;
		head.next = head.next.next;
		LinkedListNode current = head.next;
		System.out.println(current.data);
		while (current != null && current.next != null) {
			currEvens.next = current.next;
			currEvens = currEvens.next;
			if (current.next.next == null) break;
			current = current.next.next;
		}
		currEvens.next = null;
		current.next = evens;
		return head;
	}
	
	public static void printList(LinkedListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("/");
	}

}
