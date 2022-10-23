class Solution {
    public int[] findErrorNums(int[] nums) {
        // int N = nums.length, sum = N * (N + 1) / 2;
        // int[] ans = new int[2];
        // boolean[] seen = new boolean[N+1];
        // for (int num : nums) {
        //     sum -= num;
        //     if (seen[num]) ans[0] = num;
        //     seen[num] = true;
        // }
        // ans[1] = sum + ans[0];
        // return ans;
        
          int N = nums.length;
        int[] ans = new int[2];
        for (int num : nums)
            nums[(num - 1) % 10000] += 10000;
        for (int i = 0; i < N; i++)
            if (nums[i] > 20000) ans[0] = i + 1;
            else if (nums[i] < 10001) ans[1] = i + 1;
        return ans;
    }
}