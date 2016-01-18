/*
William Thing
1/17/16

print the kth to last element of a singly linked list
*/

public class KthToLastElement {

   public static final int k = 2;
   
   public static void main(String[] args) {
      LinkedListNode front = new LinkedListNode(0);
      LinkedListNode current = front;
      for (int i = 1; i <= 10; i++) {
         current.next = new LinkedListNode(i);
         current = current.next;
      }
      //System.out.println(current.data);
      //System.out.println(front.data);
      
      long startTime = System.nanoTime();
      kthToLastRecurr(front, k);
      long endTime = System.nanoTime();
      System.out.println((endTime - startTime) / Math.pow(10, 6)); // time in milliseconds
      
      startTime = System.nanoTime();
      kthToLastIterative(front, k);
      endTime = System.nanoTime();
      System.out.println((endTime - startTime) / Math.pow(10, 6)); // time in milliseconds
      /*
      Judging the difference between my solutions the execution
      time of my iterative algorithm is faster than my recursive
      */
      
      // given solution does it differently
      // where the they count the last element as 1th away
      // when I consider it 0th away since it is the last element
      startTime = System.nanoTime();
      nthToLast(front, k);
      endTime = System.nanoTime();
      System.out.println((endTime - startTime) / Math.pow(10, 6)); // time in milliseconds
   }
   
   // recursive algorithm to find kth to last element of a singly linked list
   // prints the kth element if found, otherwise doesn't print anything.
   public static int kthToLastRecurr(LinkedListNode node, int k) {
      if (node != null) {
         int posi = kthToLastRecurr(node.next, k);
         if (posi == k)
            System.out.println(node.data);
         return posi + 1;
      }
      return 0;
   }
   
   // iterative algorithm to find kth to last element of a singly linked list
   // prints the kth element if found, otherwise nothing
   // returns -1 if given list is null, 0 if not found, and 1 if found
   public static int kthToLastIterative(LinkedListNode front, int k) {
      if (front == null) {
         return -1;
      }
      LinkedListNode current = front;
      LinkedListNode kthAway = front;
      // create the displacement between kth away pointer and current mark
      for (int i = 0; i < k; i++) {
         if (kthAway.next == null) 
            return 0;
         kthAway = kthAway.next;
      }
      // move each pointer one by one
      while (kthAway.next != null) {
         kthAway = kthAway.next;
         current = current.next;
      }

      System.out.println(current.data);
      return 1;
   }
   
   // given solution
   public static void nthToLast(LinkedListNode head, int k) {
      LinkedListNode p1 = head;
      LinkedListNode p2 = head;
      
      for (int i = 0; i < k; i++) {
         if (p1 == null) break;
         p1 = p1.next;
      }
      
      while (p1 != null) {
         p1 = p1.next;
         p2 = p2.next;
      }
      
      System.out.println(p2.data);  // assuming p2 is correct
   }
}