/*
William Thing
1/16/16

For each level of the tree print the level and
an array of the node values in that level
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GetLevel {

   public static void main(String[] args) {
      Node root = new Node(5);
      root.left = new Node(4);
      root.right = new Node(7);
      root.left.left = new Node(9);
      root.left.left.left = new Node(8);
      root.left.left.left.right = new Node(1);
      
      root.right.left = new Node(0);
      root.right.left.left = new Node(3);
      root.right.left.left.left = new Node(13);
      root.right.left.left.right = new Node(15);
      root.right.right = new Node(11);
      root.right.right.left = new Node(12);
      root.right.right.right = new Node(11);
      root.right.right.left.left = new Node(14);
      root.right.right.left.right = new Node(19);
      root.right.right.right.left = new Node(77);
      root.right.right.right.right = new Node(69);
      root.right.right.right.right.left = new Node(1);
      //visitAndPrint(root);     // for testing purposes
      getLevel(root);
   }
   
   // visit and prints each node of tree in pre-order
   public static void visitAndPrint(Node root) {
      if (root!=null) {
         System.out.println(root.getData());
         visitAndPrint(root.left);
         visitAndPrint(root.right);
      }
   }
   
   public static void getLevel(Node root) {
      Queue<Node> q = new LinkedList<Node>();
      List<Integer> nodeInLevel = new ArrayList<Integer>();
      q.add(root);
      int prevSize = q.size();
      int level = 1;
      while (!q.isEmpty()) {
         Node tmp = q.remove();
         nodeInLevel.add(tmp.getData());
         if (tmp.left != null)
            q.add(tmp.left);
         if (tmp.right != null)
            q.add(tmp.right);
         prevSize--;
         if (prevSize == 0) {
            prevSize = q.size();
            System.out.print("level " + level + ": ");
            level++;
            System.out.println(nodeInLevel);
            nodeInLevel.clear();
         } 
      }
   }
}