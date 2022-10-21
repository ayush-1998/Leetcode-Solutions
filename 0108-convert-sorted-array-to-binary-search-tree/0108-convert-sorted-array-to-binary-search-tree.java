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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return construct(nums,0,n-1);
        
    }
    public TreeNode construct(int[] nums, int si, int ei)
    {
        
        if(si > ei)
            return null;
        int mid = (si + ei)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = construct(nums,si, mid-1);
        node.right = construct(nums,mid+1,ei);
        
        return node;
    }
}