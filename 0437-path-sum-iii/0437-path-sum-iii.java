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

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        return helper(root, 0, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    private int helper(TreeNode root, long sum, int tar){
        int res = 0;
        if(root == null){
            return res;
        }
        if(sum + root.val == tar){
            res++;
        }
        
        res += helper(root.left, sum + root.val, tar);
        res += helper(root.right, sum + root.val, tar);

        return res;
    }
}
