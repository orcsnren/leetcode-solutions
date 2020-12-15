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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null)
            return true;
        if (leftNode == null || rightNode == null)
            return false;
        //System.out.println(leftNode.val+" "+rightNode.val);
        return (leftNode.val == rightNode.val) && isMirror(leftNode.right, rightNode.left) && isMirror(leftNode.left, rightNode.right);
    }

}
