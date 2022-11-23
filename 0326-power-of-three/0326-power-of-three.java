class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n <= 0) return false;
        // while(n != 1)
        // {
        //     int rem = n % 3;
        //     n = n/3;
        //     if(rem != 0) return false;
        // }
        // return true;
        
        while(n >= 3)
        {
            if(n % 3 != 0) return false;
            n /= 3;
           
        }
        return n == 1;
    }
}