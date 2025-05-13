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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return hasPathSumInternal(root, targetSum);
    }

    private boolean hasPathSumInternal(TreeNode root, int targetSum) {
        // System.out.println(root.val);
        if (root.right == null) {
            if (root.left == null) {
                return (targetSum == root.val);
            }
            return hasPathSum(root.left, targetSum-root.val);
        }
        if (hasPathSum(root.right, targetSum-root.val)) {
            return true;
        }
        if (root.left != null) {
            if (hasPathSum(root.left, targetSum-root.val)) {
                return true;
            }
        }

        return false;
    }
}