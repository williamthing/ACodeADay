/*William Thing
 * 
 * Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
package projects;

import java.util.Stack;

public class PalindromeLinkedList {
	
	public static void main(String[] arg) {
		String s1 = "anwwina";
		ListNode list1 = stringToLinkedList(s1);
		printList(list1);
		System.out.println(isPalindrome(list1)); // false
		
	}
	
	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true;
		Stack<Character> s = new Stack<Character>();
		
		ListNode current = head;
		ListNode runner = head;
		while (runner != null && runner.next != null) {
			current = current.next;
			runner = runner.next.next;
		}
		if (runner != null) {
			current = current.next;
		}
		while (current != null) {
			s.push(current.data);
			current = current.next;
		}
		current = head;
		while (!s.isEmpty()) {
			int tmp = s.pop();
			if (tmp != current.data) return false;
			current = current.next;
		}
		return true;
	}
	
	// changes a given string to linked list of linked char nodes
	public static ListNode stringToLinkedList(String s) {
		ListNode head = null, current = null;
		for (int i = 0; i < s.length(); i++) {
			if (head == null) {
				head = new ListNode(s.charAt(i));
				current = head;
			} else {
				current.next = new ListNode(s.charAt(i));
				current = current.next;
			}
		}
		return head;
	}
	
	// recursive print method
	public static void printList(ListNode head) {
		if (head != null) {
			System.out.print(head.data + "->");
			printList(head.next);
		} else {
			System.out.println("/");
		}
	}
}
