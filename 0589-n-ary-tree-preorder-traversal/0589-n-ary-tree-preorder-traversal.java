/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        
        Stack<Node> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        st.push(root);
        while(!st.empty())
        {
            Node curr = st.pop();
            res.add(curr.val);
            for(int i=curr.children.size()-1;i>=0;i--)
            {
                st.push(curr.children.get(i));
            }
        }
        return res;
    }
}