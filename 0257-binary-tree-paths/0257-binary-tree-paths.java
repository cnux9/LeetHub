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
    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        internal(root, root.val + "");
        return result;
    }

    private void internal(TreeNode node, String prevPath) {
        if (node.left == null && node.right == null) {
            result.add(prevPath);
        } else {
            if (node.left != null) {
                internal(node.left, prevPath + "->" + node.left.val);
            }
            if (node.right != null) {
                internal(node.right, prevPath + "->" + node.right.val);
            }
        }
    }
}