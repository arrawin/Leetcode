/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
       ArrayList<Integer> res = new ArrayList<>();
       traverse(res,root);
       return res;
    
    }
    public void traverse(ArrayList<Integer>res,Node root){
        if(root==null){
            return;
        }

        res.add(root.val);
        for(Node child:root.children)
        {
            traverse(res,child);
        }
    }
}