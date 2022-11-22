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
   
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.empty())
        {
            root = st.pop();
            list.add(0,root.val);
            if(root.left != null) st.push(root.left);
            if(root.right != null) st.push(root.right);
        }
        
        return list;
    }
}