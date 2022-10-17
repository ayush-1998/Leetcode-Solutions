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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return new ArrayList<>();
        q.addLast(root);
        while(q.size() != 0)
        {
            int size = q.size();
            ArrayList<Integer> smallans = new ArrayList<>();
            while(size-->0)
            {
                TreeNode rm = q.removeFirst();
                smallans.add(rm.val);
                
                if(rm.left != null)
                {
                    q.addLast(rm.left);
                }
                if(rm.right != null)
                {
                    q.addLast(rm.right);
                }
            }
            ans.add(smallans);
            
        }
        return ans;
    }
}