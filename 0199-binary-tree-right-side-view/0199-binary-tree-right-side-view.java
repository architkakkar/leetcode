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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        TreeNode curr = root;
        TreeNode last = root;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
                curr = node.left;
            }
            if (node.right != null) {
                queue.offer(node.right);
                curr = node.right;
            }

            if (node == last) {
                ans.add(last.val);
                last = curr;
            }
        }

        return ans;
    }
}