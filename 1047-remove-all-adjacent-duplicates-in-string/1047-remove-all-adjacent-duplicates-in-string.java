class Solution {
    public String removeDuplicates(String s) {
    //       StringBuilder sb = new StringBuilder();
    //     for (char ch: s.toCharArray()) {
    //         if ( sb.length() != 0 && sb.charAt(sb.length() - 1) == ch ) {
    //             sb.deleteCharAt(sb.length() - 1);
    //         } else {
    //             sb.append(ch);
    //         }
    //     }
    //     return sb.toString();
    // }
        
          Stack<Character> stack = new Stack<>();
    stack.push(s.charAt(0));
    for(int i=1;i<s.length();i++){
        char c = s.charAt(i);
		// if stack is empty or the top element of the stack is not current we have then push into the stack
        if(stack.isEmpty() || stack.peek() != c){
            stack.push(c);
        }// otherwise pop from the stack
		else{
            stack.pop();
        }
    }
	// pop all the element which is left in the stack and store into the string and return;
    String ans="";
    while (!stack.isEmpty()){
        ans=stack.pop()+ans;
    }
    return ans;
}
}