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
//     public int countNodes(TreeNode root) {
//         if(root == null) return 0;
        
//         int lc = countNodes(root.left);
//         int rc = countNodes(root.right);
        
//         int total = lc + rc + 1;
//         return total;
//     }
    
     public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int left = getHeightLeft(root);
        int right = getHeightRight(root);
        
        //If left and right are equal it means that the tree is complete and hence go for 2^h -1.
        if(left == right) return ((2<<(left)) -1);
            
        //else recursively calculate the number of nodes in left and right and add 1 for root.
        else return countNodes(root.left)+ countNodes(root.right)+1;
    }
    
    
    public int getHeightLeft(TreeNode root){
        int count=0;
        while(root.left!=null){
            count++;
            root = root.left;
        }
        return count;
    }
    
    
    public int getHeightRight(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}