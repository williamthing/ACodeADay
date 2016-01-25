/*	William Thing
 * 
 * 	Given a binary tree, return the level order traversal of its
 * 	nodes values
 * 	from left to right, level by level
 */

package projects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLvlOrderTraversal {

	public static void main(String[] arg) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(15);
		
		List<List<Integer>> result = levelOrder(root);
		System.out.println(result);
	}
	
	//	pre: 	takes a given binary tree
	//	post:	returns a list of integer lists, representing each level of a given
	//			binary tree
	public static List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int prevSize = q.size();
		List<List<Integer>> levelOrderData = new ArrayList<List<Integer>>();
		List<Integer> dataOfLevel = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			TreeNode removedNode = q.remove();
			if (removedNode.left != null) {
				q.add(removedNode.left);
			}
			if (removedNode.right != null) {
				q.add(removedNode.right);
			}
			dataOfLevel.add(removedNode.data);
			prevSize--;
			if (prevSize == 0) {
				levelOrderData.add(dataOfLevel);
				dataOfLevel = new ArrayList<Integer>();
				prevSize = q.size();
			}
		}
		return levelOrderData;	
	}
}
