class Solution {

    public int missingNumber(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;
        
        
        while(left < right)
        {
            int mid = (left + right)/2;
            if(nums[mid] > mid)
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
