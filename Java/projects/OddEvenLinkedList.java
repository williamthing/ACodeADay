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
		l1 = oddEvenList(l1);
		printList(l1);
		LinkedListNode l2 = new LinkedListNode(10);
		l2 = oddEvenList(l2);
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
		
		LinkedListNode tmp = l3;
		l3 = new LinkedListNode(69);
		l3.next = tmp;
		printList(l3);
		// 69->10->22->15->33->17->/
		l3 = oddEvenList2(l3);
		printList(l3);
		l3 = oddEvenList2(l3);
		printList(l3);
	
	}
	
	//	arranges nodes so that the odd nodes (not data just node order) come first and the
	//	even nodes in the original list are last.
	public static LinkedListNode oddEvenList(LinkedListNode head) {
		if (head == null || head.next == null || head.next.next == null) return head;
		LinkedListNode evens = head.next;
		LinkedListNode currEvens = evens;
		head.next = head.next.next;
		LinkedListNode current = head.next;
		while (current != null && current.next != null) {
			currEvens.next = current.next;
			currEvens = currEvens.next;
			if (current.next.next == null) {
				break;
			}
			current.next = current.next.next;
			current = current.next;
		}
		currEvens.next = null;
		current.next = evens;
		return head;
	}
	
	// after looking at someone's solution, trying a more understandable and readable implementation
	public static LinkedListNode oddEvenList2(LinkedListNode head) {
		if (head == null) return null;
		if (head.next == null || head.next.next == null) return head;
		LinkedListNode oddHead = head;
		LinkedListNode evenHead = head.next;
		LinkedListNode oddP = oddHead;
		LinkedListNode evenP = evenHead;
		while (evenP != null && evenP.next != null) {
			oddP.next = oddP.next.next;
			evenP.next = evenP.next.next;
			oddP = oddP.next;
			evenP = evenP.next;
		}
		oddP.next = evenHead;
		return oddHead;
	}
	
	// prints a given list in order from front to last
	public static void printList(LinkedListNode head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("/");
	}

}
