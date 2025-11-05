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
    public boolean isUnivalTree(TreeNode root) {
        return internal(root.val, root);
    }

    private boolean internal(int val, TreeNode node) {
        if (node == null) {
            return true;
        }
        if (node.val != val) {
            return false;
        }
        if (internal(val, node.left) && internal(val, node.right)) {
            return true;
        }
        return false;
    }
}