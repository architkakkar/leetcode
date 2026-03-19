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
// Recursive Solution
// TC: O(n) - worst case, average O(log n)
// SC: O(H) - height of tree
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}

/*
// Iterative Solution
// TC: O(n) - worst case, average O(log n)
// SC: O(1)
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode node = root;
        TreeNode prev = null;

        while (node != null) {
            prev = node;
            
            if (node.val > val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        
        if (prev.val > val) {
            prev.left = new TreeNode(val);
        } else {
            prev.right = new TreeNode(val);
        }
        
        return root;
    }
}
*/