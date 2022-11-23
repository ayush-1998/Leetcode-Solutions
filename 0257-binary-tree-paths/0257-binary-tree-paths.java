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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        
        if(root != null)
        {
            search(root,"",res);
        }
        
        return res;
    }

    public void search(TreeNode root, String psf, List<String> res)
    {
        if(root.left == null && root.right == null)
        {
            res.add(psf + root.val);
        }
        
        if(root.left != null)
        {
            search(root.left, psf + root.val + "->", res);
        }
        
        if(root.right != null)
        {
            search(root.right, psf + root.val + "->", res);
        }
    }
}