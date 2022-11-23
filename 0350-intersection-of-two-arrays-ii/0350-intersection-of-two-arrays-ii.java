class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
  
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] == nums2[j])
            {
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        
        int idx = 0;
        int[] ans = new int[res.size()];
        for(Integer t : res)
        {
            ans[idx++] = t;
        }
        
        return ans;
        
    }
}