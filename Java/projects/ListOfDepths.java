// William Thing
// 1/18/16

// Given a binary tree, design an algorithm which creates a linked list of
// all the nodes at each depth
// e.g. a tree with depth D will have D linkedlist

package projects;

import java.util.ArrayList;
import java.util.List;

public class ListOfDepths {
	
	// practicing inner classes
	private class LinkedListNode {
		public int data;
		public LinkedListNode next;
		
		private LinkedListNode(int n) {
			this(n, null);
		}
		
		private LinkedListNode(int n, LinkedListNode other) {
			this.data = n;
			this.next = other;
		}
	}
	
	public static void main(String[] args) {
		ListOfDepths lod = new ListOfDepths();
		ListOfDepths.LinkedListNode node1 = lod.new LinkedListNode(5);
		ListOfDepths.LinkedListNode node2 = lod.new LinkedListNode(7, node1);
		
	}
	
	public static List<LinkedListNode> findListOfDepths(TreeNode root) {
		List<LinkedListNode> listOfLinkedNodes = new ArrayList<LinkedListNode>();
		return listOfLinkedNodes;
	}
}
