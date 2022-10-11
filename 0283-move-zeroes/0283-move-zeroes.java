class Solution {
    public void moveZeroes(int[] nums) {
//         int[] arr = new int[nums.length];
//         int itr = nums.length-1;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i] == 0)
//             {
//                 arr[itr--] = nums[i];
//             }
//         }
        
//         itr = 0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i] != 0)
//             {
//                 arr[itr++] = nums[i];
//             }
//         }
        
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i] = arr[i];
//         }
        if(nums == null || nums.length == 0) return; 
        
        int itr = 0;
        for(int num : nums)
        {
            if(num != 0)
            {
                nums[itr++] = num;
            }
        }
        
        while(itr < nums.length)
        {
            nums[itr++] = 0;
        }
        
    }
}