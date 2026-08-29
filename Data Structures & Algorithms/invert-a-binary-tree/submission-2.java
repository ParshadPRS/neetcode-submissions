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
    private void invertNode(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;

        invertNode(root.left);
        invertNode(root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertNode(root);

        return root;
    }
}
