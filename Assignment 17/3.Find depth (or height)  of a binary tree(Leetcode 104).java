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
    public int maxDepth(TreeNode root) {
       return helper(root);
    }
    public int helper(TreeNode root){
        if(root==null) return 0;
        int leftdepth= helper(root.left);
        int rightdepth= helper(root.right);
        return 1+Math.max(leftdepth,rightdepth);
    }
}