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
    List<Integer> traversal = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        internal(root);
        return traversal;
    }

    private void internal(TreeNode node) {
        if (node == null) return;
        traversal.add(node.val);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}