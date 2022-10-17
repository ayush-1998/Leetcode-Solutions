class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        dp[0] = 0;
        for(int i=1;i<=amount;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=1;i<=amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(coins[j]<=i)
                {
                    int res = dp[i-coins[j]];
                    if(res!=Integer.MAX_VALUE && res+1<dp[i])
                    {
                        dp[i]=res+1;
                    }
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
        {
            return -1;
        }
        return dp[amount];
    }
}