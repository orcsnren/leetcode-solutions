/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	List<Integer> list = new ArrayList<>();

	public int findBottomLeftValue(TreeNode root) {
		int height = getHeight(root);
		traversal(root, height);
		return list.get(0);
	}

	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		else {
			int leftHeight = getHeight(root.left);
			int rightHeight = getHeight(root.right);

			if (leftHeight > rightHeight)
				return (leftHeight + 1);
			else
				return (rightHeight + 1);
		}
	}

	public void traversal(TreeNode root, int level) {
		if (root == null)
			return;
		if (level == 1) {
			list.add(root.val);
			return;
		} else if (level > 1) {
			traversal(root.left, level - 1);
			traversal(root.right, level - 1);
		}
	}
}