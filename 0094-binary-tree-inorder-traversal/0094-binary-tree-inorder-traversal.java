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
    
    public TreeNode getRightMost(TreeNode leftnode, TreeNode curr)
    {
        while(leftnode.right != null && leftnode.right != curr)
        {
            leftnode = leftnode.right;
        }
        return leftnode;
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
 
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null)
        {
            TreeNode leftNode = curr.left;
            if(leftNode == null)
            {
                res.add(curr.val);
                curr = curr.right;
            }
            else
            {
                TreeNode rightMostNode = getRightMost(leftNode,curr);
                if(rightMostNode.right == null)
                {
                    rightMostNode.right = curr;
                    curr = curr.left;
                }
                else
                {
                    rightMostNode.right = null;
                    res.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return res;
    }
}