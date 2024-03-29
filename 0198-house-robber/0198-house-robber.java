class Solution {
    public int rob(int[] nums) {
        int prevTwo = 0, prevOne = 0, max = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(prevTwo + nums[i], prevOne);
            
            prevTwo = prevOne;
            prevOne = max;
        }
        
        return max;
    }
}