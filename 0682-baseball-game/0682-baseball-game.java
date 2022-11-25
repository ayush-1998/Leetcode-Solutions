class Solution {
    public int calPoints(String[] ops) {
        int sum =0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i =0; i< ops.length;i++){
            if(ops[i].equals("C")){
                stack.pop();
            }
            else if(ops[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if(ops[i].equals("+")){
                 int num1 = stack.pop();
                 int num2 = stack.pop();
                 stack.push(num2);
                 stack.push(num1);
                 stack.push(num1 + num2);
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        while(stack.size() > 0){
            sum+=stack.pop();
        }
        return sum;
    }
}