/* William Thing
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest 
path from the root node down to the nearest leaf node.
 */

package projects;

public class MinDepth {

	public static void main(String[] arg) {
		TreeNode head = new TreeNode(5);
		head.left = new TreeNode(4);
		head.right = new TreeNode(6);
		System.out.println(findMinDepth(head));
	}
	
	
	public static int findMinDepth(TreeNode root) {
		if (root == null) return 0;
		if (root.left != null && root.right != null) {
			return Math.min(findMinDepth(root.left), findMinDepth(root.right)) + 1;
		} else {
			return Math.max(findMinDepth(root.left), findMinDepth(root.right)) + 1;
		}
	}
}
