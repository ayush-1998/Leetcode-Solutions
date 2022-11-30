class Solution {
    public int[] sortedSquares(int[] arr) {
      int res[] = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        int idx = arr.length-1;
        while(i <= j)
        {
            int val1 = arr[i] * arr[i];
            int val2 = arr[j] * arr[j];
            if(val1 > val2)
            {
                res[idx] = val1;
                i++;
            }
            else
            {
                res[idx] = val2;
                j--;
            }
            idx--;
        }
        return res;
    }
}