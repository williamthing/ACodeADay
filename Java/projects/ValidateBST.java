/*
 * William Thing
 * 1/18/16
 * 
 * Validate if a binary tree is a binary search tree
 */

package projects;

public class ValidateBST {
	
	public static void main(String[] args) {
		// root1 designed to be false
		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(4);
		root1.right = new TreeNode(8);
		
		root1.right.left = new TreeNode(11);
		root1.right.right = new TreeNode(12);
		
		// root3 designed to be true
		TreeNode root3 = new TreeNode(18);
		root3.left = new TreeNode(12);
		root3.right = new TreeNode(20);
		// root2 designed to be false
		TreeNode root2 = root1.right;
		long startTime = System.nanoTime();
		boolean result1 = validateBST(root1);
		long endTime = System.nanoTime();
		System.out.println((endTime - startTime) / Math.pow(10, 6));
		
		// Comparing run time of my method and solutions
		/*
		startTime = System.nanoTime();
		checkBST(root1);
		endTime = System.nanoTime();
		System.out.println((endTime - startTime) / Math.pow(10, 6));
		*/
		
		// checking results/edgecases
		boolean result2 = validateBST(root2);
		boolean result3 = validateBST(new TreeNode(1));
		boolean result4 = validateBST(root3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
	// recursive algorithm to validating if a given tree is a binary search tree or not
	// TODO: Refactor code and make more efficient
	public static boolean validateBST(TreeNode root) {
		if (root!= null) {
			boolean isBST = validateBST(root.left) & validateBST(root.right);
			if (root.left != null && root.right != null) {
				return isBST && (root.data >= root.left.data) && (root.data < root.right.data);
			}
			if (root.left != null)
				return isBST && root.data >= root.left.data;
			if (root.right != null)
				return isBST && root.data < root.right.data;
		}
		return true;
	}
	
	// given solution
	public static boolean checkBST(TreeNode n) {
		return checkBST(n, null, null);
	}
	
	private static boolean checkBST(TreeNode n, Integer min, Integer max) {
		if (n == null) {
			return true;
		}
		if ((min != null && n.data <= min) || (max != null && n.data> max)) {
			return false;
		}
		if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
			return false;
		}
		return true;	
	}
}
