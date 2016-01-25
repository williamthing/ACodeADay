package projects;

public class IsBST {

	public static void main(String[] args) {
		TreeNode head = new TreeNode(10);
		head.left = new TreeNode(5);
		head.left.right = new TreeNode(6);
		//System.out.println(isBST(head, head.data, head.data));
		System.out.println(checkBST(head));
	}
	
	public static boolean isBST(TreeNode root, int min, int max) {
		if (root != null) {
			boolean bst = root.data <= max && root.data >= min;
			
			if (root.left != null && root.right != null) {
				return bst && isBST(root.left, Math.min(min, root.data), Math.max(max, root.data)) 
						&& isBST(root.right, Math.min(min, root.data), Math.max(max, root.data));
			} else if (root.left != null) {
				return bst && isBST(root.left, Math.min(min, root.data), Math.min(min, root.data));
			} else {
				return bst && isBST(root.right, Math.max(max, root.data), Math.min(min, root.data));
			}	
		}
		return true;	
	}
	
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
