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
    public TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
         // if root is null then return true
        if(root == null) return true;
        
        // we will use Inorder Traversal Concept here
        // if left side is not BST then false
        if(!isValidBST(root.left))
            return false;
        
        // if prev != null and root's val is less or equal to the prev then false
        if(prev != null && root.val <= prev.val)
            return false;
        // if not then updata the root
        prev = root;
            
        // go for the right sub tree
        return isValidBST(root.right);
    }
}