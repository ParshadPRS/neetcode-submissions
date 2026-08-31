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

    private boolean check(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }

        return (
            check(root.left, minValue, root.val) && 
            check(root.right, root.val, maxValue)
        );

    }

    public boolean isValidBST(TreeNode root) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        return check(root, minValue, maxValue);
        
    }
}
