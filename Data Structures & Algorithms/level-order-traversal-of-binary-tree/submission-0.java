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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> nodes = new ArrayDeque<>();
        nodes.addLast(root);

        while (!nodes.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = nodes.size();

            for(int i=0 ; i<size ; i++) {
                TreeNode top = nodes.pollFirst();
                subList.add(top.val);

                if (top.left != null) {
                    nodes.addLast(top.left);
                }
                if (top.right != null) {
                    nodes.addLast(top.right);
                }
            }
            result.add(subList);
        }
        return result;
    }
}
