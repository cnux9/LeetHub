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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        internal(root1, list1);
        internal(root2, list2);

        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;

    }

    private void internal(TreeNode root, List<Integer> list) {
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            if (root.left != null) {
                internal(root.left, list);
            }
            if (root.right != null) {
                internal(root.right, list);
            }
        }
    }
}