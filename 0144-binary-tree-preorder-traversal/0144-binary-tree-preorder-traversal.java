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
    public TreeNode getRightmost(TreeNode leftnode, TreeNode curr)
    {
       while(leftnode.right != null && leftnode.right != curr)
       {
           leftnode = leftnode.right;
       }
        return leftnode;
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null)
        {
            TreeNode leftnode = curr.left;
            if(leftnode == null)
            {
                res.add(curr.val);
                curr = curr.right;
            }
            else
            {
                TreeNode rightMostnode = getRightmost(leftnode,curr);
                if(rightMostnode.right == null)
                {
                    res.add(curr.val);
                    rightMostnode.right = curr;
                    curr = curr.left;
                }
                else
                {
                    rightMostnode.right = null;
                    curr = curr.right;
                }
            }
        }
        return res;
    }
}