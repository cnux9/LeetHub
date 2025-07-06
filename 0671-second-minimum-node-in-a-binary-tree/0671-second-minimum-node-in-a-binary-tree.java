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
    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) {
            return -1;
        }
        int lv = root.left.val;
        int rv = root.right.val;

        if (lv == root.val) {
            lv = findSecondMinimumValue(root.left);
        }
        if (rv == root.val) {
            rv = findSecondMinimumValue(root.right);
        }
        if (lv <= root.val) {
            if (rv <= root.val) {
                return -1;
            } else {
                return rv;
            }
        } else {
            if (rv <= root.val) {
                return lv;
            } else {
                return lv < rv ? lv : rv;
            }
        }
    }
}