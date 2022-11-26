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
  
    public TreeNode head = new TreeNode(-1);
    public TreeNode temp = head;
    
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head.right;
    }
   
    public void inorder(TreeNode root)
    {
        if(root != null)
        {
            inorder(root.left);
            temp.right = root;
            root.left = null;
            temp = root;
            inorder(root.right);
        }
    }
}