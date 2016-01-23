//William Thing
// Compare two binary tree and see if they are the same

package projects;

public class CompareBinaryTree {
	
	public static void main(String[] arg) {
		TreeNode root1 = new TreeNode(0);
		TreeNode root2 = new TreeNode(0);
		root1.left = new TreeNode(3);
		//root1.right = new TreeNode(5);
		//root1.left.left = new TreeNode(7);
		root2.left = new TreeNode(3);
	
		if (isSameBT(root1, root2)) {
			System.out.println("YES IT IS THE SAME!!");
		} else {
			System.out.println("IT IS NOT THE SAME!!");
		}
	}


	public static boolean isSameBT(TreeNode root1, TreeNode root2) {
		if (root1 != null && root2 != null) {
			return root1.data == root2.data && isSameBT(root1.left, root2.left) && isSameBT(root1.right, root2.right);
		} else if (root1 == null && root2 != null) {
			return false;
		} else if (root1 != null && root2 == null) {
			return false;
		}
		return true;
	}
}
