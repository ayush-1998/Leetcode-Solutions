class Solution {
    public int largestPerimeter(int[] A) {
         Arrays.sort(A);
        int peri = 0;
        for (int i = A.length - 1; i >= 2; i--)
            if (A[i - 1] + A[i - 2] > A[i])
            {
                peri =  A[i] + A[i - 1] + A[i - 2];
                break; 
            }
               
        return peri;
        
    }
}