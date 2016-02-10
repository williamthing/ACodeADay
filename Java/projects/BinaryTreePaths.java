/* William Thing
 * Given a binary tree, return all root-to-leaf paths.

For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:

["1->2->5", "1->3"]
 */

package projects;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public static void main(String[] arg) {
		TreeNode head = new TreeNode(3);
		head.left = new TreeNode(4);
		head.right = new TreeNode(7);
		head.left.left = new TreeNode(5);
		head.left.right = new TreeNode(6);
		List<String> list = binaryTreePaths(head);
		System.out.println(list);
	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root == null) return null;
        String path = "" + root.data;
        pathHelper(root, list, path);
        return list;
    }
	
	private static void pathHelper(TreeNode root, List<String> list, String s) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			list.add(s);
			return;
		}
		if (root.left != null) pathHelper(root.left, list, s + "->" + root.left.data);
		if (root.right != null) pathHelper(root.right, list, s + "->" + root.right.data);
	}
}
