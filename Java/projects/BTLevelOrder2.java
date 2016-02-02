/* William Thing
 * Given a binary tree, return the bottom-up level order traversal 
 * of its nodes' values. (ie, from left to right, level by level 
 * from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */

package projects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BTLevelOrder2 {
	
	public static void main(String[] arg) {
		TreeNode head = new TreeNode(3);
		head.left = new TreeNode(9);
		head.right = new TreeNode(20);
		head.right.left = new TreeNode(15);
		head.right.right = new TreeNode(7);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		levelOrder(head, a);
		reverseList(a);
		System.out.println(a);
	}
	
	public static void levelOrder(TreeNode root, ArrayList<ArrayList<Integer>> result) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int prevSize = q.size();
		while (!q.isEmpty()) {
			TreeNode temp = q.remove();
			prevSize--;
			list.add(temp.data);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
			if (prevSize == 0) {
				result.add(list);
				list = new ArrayList<Integer>();
				prevSize = q.size();
			}
		}
	}
	
	private static void reverseList(ArrayList<ArrayList<Integer>> a) {
		for (int i = 0; i < a.size() / 2; i++) {
			ArrayList<Integer> temp = a.get(i);
			a.set(i, a.get(a.size() - 1 - i));
			a.set(a.size() - 1 - i, temp);
		}
	}
}
