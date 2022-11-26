class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stringCompare(s).equals(stringCompare(t));
    }
   
    public String stringCompare(String str)
    {
        Stack<Character> st = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(c != '#')
            {
                st.push(c);
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
        }
        return st.toString();
    }
    
}