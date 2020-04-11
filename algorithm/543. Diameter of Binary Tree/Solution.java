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
    int ans = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null){ 
            return 0;
        }
        int leftCount = depth(node.left);
        int rightCount = depth(node.right);
        ans = Math.max(ans, leftCount+rightCount+1);
        return Math.max(leftCount, rightCount) + 1;
    }
}