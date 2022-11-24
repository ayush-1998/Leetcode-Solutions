class Solution {
    public int fib(int n) {

        int[] dp = new int[n+1];
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fibo = fib1 + fib2;
        dp[n] = fibo;
        return fibo;
    }
}