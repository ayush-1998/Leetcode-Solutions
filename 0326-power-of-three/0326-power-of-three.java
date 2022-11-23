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
        
//         while(n >= 3)
//         {
//             if(n % 3 != 0) return false;
//             n /= 3;
           
//         }
//         return n == 1
        
          if (n <= 0)
            return false;
        return 1162261467 % n == 0; // same as return (int) Math.pow (3, 19) % n == 0;;
    }
}