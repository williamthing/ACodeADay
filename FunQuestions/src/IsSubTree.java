/* William Thing
 * 
 * Check if a binary tree is a subtree of another binary tree
 */
public class IsSubTree {
	
	public static void main(String[] arg) {
		TreeNode head = new TreeNode(26);
		head.left = new TreeNode(10);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(6);
		head.left.left.right = new TreeNode(30);
		head.right.right = new TreeNode(3);
		
		TreeNode other = new TreeNode(10);
		other.left = new TreeNode(4);
		other.right = new TreeNode(6);
		other.left.right = new TreeNode(30);
		
		if (isSubTree(head, other)) System.out.println("Success!!");
		else System.out.println("FAILLEDDD!!");
	}
	
	public static boolean isSubTree(TreeNode main, TreeNode other) {
		if (main==null && other==null) return true;
		if (main==null || other==null) return false;
		if (checkTree(main, other)) return true;
		return isSubTree(main.left, other) || isSubTree(main.right, other);
	}
	
	public static boolean checkTree(TreeNode root1, TreeNode root2) {
		if (root1==null && root2==null) return true;
		if(root1==null || root2==null) return false;
		return (root1.val == root2.val) && checkTree(root1.left, root2.left) && checkTree(root1.right, root2.right);
	}
}
