/*
William Thing
1/17/16

print the kth to last element of a singly linked list
*/

public class KthToLastElement {
   
   public static void main(String[] args) {
      LinkedListNode front = new LinkedListNode(0);
      LinkedListNode current = front;
      for (int i = 1; i <= 10; i++) {
         current.next = new LinkedListNode(i);
         current = current.next;
      }
      //System.out.println(current.data);
      //System.out.println(front.data);
      kthToLastRecurr(front, 3);
      
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

}