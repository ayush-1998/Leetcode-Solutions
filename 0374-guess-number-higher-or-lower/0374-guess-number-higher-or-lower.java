/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       return guess(n) == 0 ? n : guessNumberSearch(0, n);
    }
    
    public int guessNumberSearch(int l, int h)
    {
        int mid = l+ (h - l)/2;
        if(guess(mid) == 0)
        {
            return mid;
        }
        if(guess(mid) == -1)
        {
            return guessNumberSearch(l, mid-1);
        }
        else
        {
            return guessNumberSearch(mid+1, h);
        }
    }
}