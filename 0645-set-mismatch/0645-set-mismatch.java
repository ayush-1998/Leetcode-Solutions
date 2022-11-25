class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2];
        boolean[] seen = new boolean[n+1];
        int sum = n * (n + 1) / 2;
        
        for(int num : nums)
        {
            sum -= num;
            if(seen[num]) ans[0] = num;
            seen[num] = true;
        }
        
        ans[1] = sum + ans[0];
        return ans;
    }
}