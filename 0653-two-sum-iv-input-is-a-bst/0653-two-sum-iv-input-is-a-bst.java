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
    HashSet<Integer> set = new HashSet<>();
    boolean isExist = false;

    public boolean findTarget(TreeNode root, int k) {
        isExist = false;
        traversal(root, k);

        return isExist;
    }

    public void traversal(TreeNode root, int k) {
        if (root == null) return;

        if (isExist) return;

        if (set.contains(k - root.val)) {
            isExist = true;
            return;
        }
        set.add(root.val);

        traversal(root.left, k);
        traversal(root.right, k);
    }
}