/* William Thing
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:
    1
   / \
  2   2
   \   \
   3    3
 */

package projects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
	public static void main(String[] arg) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(2);
		head.left.left = new TreeNode(3);
		head.left.right = new TreeNode(4);
		head.right.left = new TreeNode(4);
		head.right.right = new TreeNode(3);
		System.out.println(isSymmetric(head));
		System.out.println(isSym(head));
	}
	
	public static boolean isSym(TreeNode root) {
		if (root == null) return true;
		return isSym(root, root);
	}
	
	private static boolean isSym(TreeNode lst, TreeNode rst) {
		if (lst == null && rst == null) return true;
		if (lst == null || rst == null) return false;
		return (lst.data == rst.data) && isSym(lst.left, rst.right) && isSym(lst.right, rst.left);
	}
	
	//	checks if a given binary tree is symmetric or not
	//	note: this implementation is extremely slow
	public static boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		int prevSize = q.size();
		List<Integer> level = new ArrayList<Integer>();
		List<Integer> nextList = new ArrayList<Integer>();
		level.add(root.data);
		while (!q.isEmpty()) {
			TreeNode tmp = q.remove();
			prevSize--;
			if (tmp.left == null) {
				nextList.add(-1);
			} else {
				q.add(tmp.left);
				nextList.add(tmp.left.data);
			}
			if (tmp.right == null) {
				nextList.add(-1);
			} else {
				q.add(tmp.right);
				nextList.add(tmp.right.data);
			}
			if (prevSize == 0) {
				System.out.println(level);
				if (!isSymmetric(level)) {
					return false;
				}
				level = nextList;
				nextList = new ArrayList<Integer>();
				prevSize = q.size();
			}
		}
		return true;
	}
	
	private static boolean isSymmetric(List<Integer> l) {
		for (int i = 0; i < l.size() / 2; i++) {
			System.out.println(l.get(i));
			System.out.println(l.get(l.size() - 1 - i));
			if (l.get(i) != l.get(l.size() - 1 - i)) return false;
		}
		return true;
	}
}
