class Solution {

    public int validCandidate(int[] arr)
    {
        int val = arr[0];;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(val == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0){
                val = arr[i];
                count = 1;
            }
        }
        return val;
    }
    
    public int majorityElement(int[] nums) {
        
        int value = validCandidate(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == value)
            {
                count++;
            }
        }
        if(count > nums.length / 2)
        {
            return value;
        }
        return 0;
        
        
    }
}