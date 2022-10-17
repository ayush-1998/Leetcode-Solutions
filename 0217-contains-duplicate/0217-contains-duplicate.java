class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i : nums)
        // {
        //     if(hs.contains(i))
        //     {
        //         return true;
        //     }
        //     else
        //     {
        //         hs.add(i);
        //     }
        // }
        // return false;
        
        if(nums == null || nums.length < 2) return false;
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1] == nums[i])
                return true;
        }
        return false;
        
    }
}