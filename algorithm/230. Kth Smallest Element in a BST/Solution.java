/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	public Integer result = 0;
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		traversal(list, root, k);
		return result;
	}

	public void traversal(List<Integer> list, TreeNode root, int k) {
		if (root == null) {
			return;
		}
		traversal(list, root.left, k);
		list.add(root.val);
		if (list.size() == k) {
			result = root.val;
			return;
		}
		traversal(list, root.right, k);

	}
}