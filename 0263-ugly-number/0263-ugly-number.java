class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        int divisor[] = {2,3,5};
        
        for(int d : divisor)
        {
            while(n % d == 0)
            {
                n /= d;
            }
        }
        return n == 1;
    }
}