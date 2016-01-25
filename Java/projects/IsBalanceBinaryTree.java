/*	William Thing
 * 
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as 
a binary tree in which the depth of the two subtrees of every 
node never differ by more than 1.
 */

package projects;

public class IsBalanceBinaryTree {
	
	public static void main(String[] arg) {
		System.out.println("///////////////////////////////////////");
		System.out.println("Top down method");
		System.out.println("///////////////////////////////////////");
		
		System.out.println("///////////////////////////////////////");
		System.out.println("Bottom up method");
		System.out.println("///////////////////////////////////////");
		
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(11);
		root.left.left = new TreeNode(13);
		root.right = new TreeNode(14);
		root.right.right = new TreeNode(15);
		root.right.right.left = new TreeNode(111);
		System.out.println(isBalanceBinaryTree(root));
		System.out.println(isBalanced(root));
		TreeNode root1 = new TreeNode(5);
		System.out.println(isBalanceBinaryTree(root1)); // true
		System.out.println(isBalanced(root1));
		root1.left = new TreeNode(6);
		System.out.println(isBalanceBinaryTree(root1)); // true
		System.out.println(isBalanced(root1));
		root1.right = new TreeNode(7);
		System.out.println(isBalanceBinaryTree(root1)); // true
		System.out.println(isBalanced(root1));
		root1.left.left = new TreeNode(8);
		System.out.println(isBalanceBinaryTree(root1)); // true
		System.out.println(isBalanced(root1));
		root1.left.left.right = new TreeNode(2);
		System.out.println(isBalanceBinaryTree(root1)); // false
		System.out.println(isBalanced(root1));	
	}
	
	// 	Online solution
	//	very smart way to do it bottom up and complexity is O(n) when
	// 	my top up solution is O(n^2)
	public static boolean isBalanced(TreeNode root) {
	    if (root == null) return true;
	    int depth = depth(root);
	    if (depth == -1) return false;
	    else return true;
	}
	
	private static int depth(TreeNode root) {
	    if (root == null) return 0;
	    int left = depth(root.left);
	    int right = depth(root.right);
	    if (left == -1 || right == -1 || Math.abs(left-right) > 1) return -1;
	    return Math.max(left,right)+1;
	}
	
	//	finds if a given root is balanced
	public static boolean isBalanceBinaryTree(TreeNode root) {
		if (root == null) return true;
		if (root.left == null && root.right == null) return true;
		int left = height(root.left);
		int right = height(root.right);
		return (Math.abs(left - right) <= 1) && isBalanceBinaryTree(root.left) && isBalanceBinaryTree(root.right);
		
	}
	
	// finds the height of a given root, null = 0, single node = 1;
	private static int height(TreeNode root) {
		if (root==null) return 0;
		if (root.left == null && root.right == null) return 1;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
}
