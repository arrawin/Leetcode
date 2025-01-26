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
    public TreeNode sortedArrayToBST(int[] nums) {
       int n = nums.length;
       TreeNode root;
       //int mid = n / 2;
       root = bST(nums,0,n-1);
       return root;
    }
    public TreeNode bST(int[] nums,int start,int end){
        TreeNode root = null;
        int mid = (start+end) / 2;
        if(end<0 || start>end)
            return null;
        root = new TreeNode(nums[mid]);
        root.left = bST(nums,start,mid-1);
        root.right = bST(nums,mid+1,end);
        return root;
    }
}