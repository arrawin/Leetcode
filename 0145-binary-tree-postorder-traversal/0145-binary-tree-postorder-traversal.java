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
    public List<Integer> postorderHelper(TreeNode root , List<Integer> List)
    {
        if(root == null){
            return List;
        }
        postorderHelper(root.left,List);
        postorderHelper(root.right,List);
        List.add(root.val);
        return List;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> List = new ArrayList<>();
       return postorderHelper(root,List);
        
    }
}