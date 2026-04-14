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
    public TreeNode invertTree(TreeNode root) {
        if(root== null) return root;

        TreeNode Right= root.right;
        TreeNode Left= root.left;
        Left= invertTree(root.right);
        Right= invertTree(root.left);
        root.left= Left;
        root.right= Right;

        return root;
    }
}
