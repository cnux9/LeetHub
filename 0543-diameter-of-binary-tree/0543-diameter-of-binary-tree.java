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
    public int diameterOfBinaryTree(TreeNode root) {
        int result = 0;
        if (root.left != null) {
            result = Math.max(result, diameterOfBinaryTree(root.left));
        }
        if (root.right != null) {
            result = Math.max(result, diameterOfBinaryTree(root.right));
        }
        // System.out.println(root.val + "  fisrt case: " + result);

        int temp = 0;
        if (root.left != null) {
            temp += maxDepthOfBinaryTree(root.left) + 1;
        }
        if (root.right != null) {
            temp += maxDepthOfBinaryTree(root.right) + 1;
        }
        result = Math.max(result, temp);

        // System.out.println(root.val + "  second case: " + result);
        return result;
    }

    private int maxDepthOfBinaryTree(TreeNode root) {
        int result = 0;
        if (root.left != null) {
            result = maxDepthOfBinaryTree(root.left) + 1;
        }
        if (root.right != null) {
            result = Math.max(result, maxDepthOfBinaryTree(root.right) + 1);
        }
        return result;
    }
}