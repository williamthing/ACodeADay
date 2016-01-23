package projects;

public class SwapLinkedList {

	public static void main(String[] args) {
		LinkedListNode front = new LinkedListNode(0);
		LinkedListNode current = front;
		for (int i = 1; i <= 10; i++) {
			current.next = new LinkedListNode(i);
			current = current.next;
		}
		printList(front);
		front = swapNodes(front, 3, 4);
		printList(front);
		//front = swapNodes(front, 3, 4);
		//printList(front);
	}
	
	// given solutions online
	public static LinkedListNode swapNodes(LinkedListNode head, int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y) return head;
 
        // Search for x (keep track of prevX and CurrX)
        LinkedListNode prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }
 
        // Search for y (keep track of prevY and currY)
        LinkedListNode prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return head;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        LinkedListNode temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        
        return head;
    }
	
	
	//	pre: 	assuming that we are swapping the first n and m we see
	//			that n and m are not side by side and not first element in the list
	//	post:	swapping 
	public static LinkedListNode swap(LinkedListNode front, int n, int m) {
		boolean nFound = false;
		LinkedListNode current = front;
		LinkedListNode swapSpot = null, temp1 = null, temp2 = null;
		while (current.next != null) {
			if (current.next.data == n || current.next.data == m) {
				nFound = (current.next.data == n);
				swapSpot = current;
				temp1 = current.next;
				break;
			}
			current = current.next; 
		}
		
		int nextVal;
		if (nFound) {
			nextVal = m;
			System.out.println("x");
		} else {
			nextVal = n;
			System.out.println("y");
		}
		
		while (current.next != null) {
			if (current.next.data == nextVal) { 
				// current.next is where we want pointer to be
				temp2 = current.next.next;
				break;
			}
			current = current.next;
		}
		// temp1 pointer to one of the two swap ints and temp2 is pointer to the other
		// swapSpot and current is pointing one before n and m nodes for swapping
		swapSpot.next = current.next;
		swapSpot.next.next = temp1.next;
		current.next = temp1;
		temp1.next = temp2;
		return front;
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
}
