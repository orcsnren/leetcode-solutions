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
class BSTIterator {
	Queue<Integer> treeQue;

	public BSTIterator(TreeNode root) {
		this.treeQue = new LinkedList<>();
		traversal(root);
	}

	/** @return the next smallest number */
	public int next() {
		return this.treeQue.poll();
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return this.treeQue.size() != 0;

	}

	public void traversal(TreeNode root) {
		if (root == null) {
			return;
		}
		traversal(root.left);
		this.treeQue.add(root.val);
		traversal(root.right);
	}
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */