/*
William Thing
1/16/16

implementation of simple bfs/dfs search algorithms
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BreadthAndDepthFirstSearch {
   public static void main(String[] arg) {
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
      visitAndPrint(root);
      System.out.println();
      breadthFirstSearch(root);
      depthFirstSearch(root);
   }
   
   // visit and prints each node of tree in pre-order
   public static void visitAndPrint(Node root) {
      if (root!=null) {
         System.out.print(root.getData());
         visitAndPrint(root.left);
         visitAndPrint(root.right);
      }
   }
   
   // breadth-first search algorithm
   public static void breadthFirstSearch(Node root) {
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      while(!q.isEmpty()) {
         Node current = q.remove();
         System.out.print(current.getData());
         if (current.left != null)
            q.add(current.left);
         if (current.right != null)
            q.add(current.right);
         
      }
      System.out.println();
   }
   
   // depth-first search algorithm
   public static void depthFirstSearch(Node root) {
      Stack<Node> stack = new Stack<Node>();
      stack.push(root);
      while (!stack.isEmpty()) {
         Node current = stack.pop();
         System.out.print(current.getData());
         if (current.right != null)
            stack.add(current.right);
         if (current.left != null)
            stack.add(current.left);
         
      }
      System.out.println();
   }

}