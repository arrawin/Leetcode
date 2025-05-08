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
    Boolean res = true;
    public int isBalancedHelper(TreeNode root) {
        if( root == null ) {
            return 0;
        }
        int leftTree = isBalancedHelper(root.left);
        int rightTree = isBalancedHelper(root.right);
        if(Math.abs( leftTree - rightTree ) > 1) res = false;
        return 1+ Math.max(leftTree , rightTree);
    }
    public boolean isBalanced(TreeNode root) {
        isBalancedHelper(root);
        return res;
    }
}