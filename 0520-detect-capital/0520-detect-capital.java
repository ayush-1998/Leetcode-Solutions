class Solution {
    public boolean detectCapitalUse(String word) {
      
        int capital = 0;
        for( char ch : word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                capital++;
            }
        }
        
        //case1 and case2
        if(capital == word.length() || capital == 0) return true;
        //case3
        return capital == 1 && Character.isUpperCase(word.charAt(0));
        
    }
}