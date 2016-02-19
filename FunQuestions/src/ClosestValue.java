/* William Thing
 * 
 */

public class ClosestValue {

	public double closestValue(TreeNode root, double target) {
		if (root==null) return -1;
		if (root.val > target) {
			if (root.left == null) return root.val;
			double x = closestValue(root.left, target);
			return findClosest(root.val, x, target);
		} else if (root.val < target) {
			if (root.right == null) return root.val;
			double x = closestValue(root.right, target);
			return findClosest(root.val, x, target);
		}
		return root.val;
	}
	
	public double findClosest(double a, double b, double target) {
		if (Math.abs(a-target) < Math.abs(b-target)) return a;
		else return b;
	}
	
	public static void main(String[] arg) {
		TreeNode head = new TreeNode(4);
		head.left = new TreeNode(3);
		head.right = new TreeNode(9);
		head.right.left = new TreeNode(8);
		head.right.right = new TreeNode(13);
		head.right.left.left = new TreeNode(7);
		head.right.right.right = new TreeNode(15);
		
		ClosestValue cv = new ClosestValue();
		double result = cv.closestValue(head, 7);
		System.out.println(result);
	}
	
}
