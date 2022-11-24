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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root == null) return false;
        else if(isSame(root, subRoot)) return true;
        else
        {
            return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
        }
    }
    
    
    public boolean isSame(TreeNode s, TreeNode t)
    {
        if(s == null || t == null)
        {
            return s == null && t == null;
        }
        else if(s.val == t.val)
        {
            return isSame(s.left, t.left) && isSame(s.right, t.right);
        }
        else
        {
            return false;
        }
    }
}