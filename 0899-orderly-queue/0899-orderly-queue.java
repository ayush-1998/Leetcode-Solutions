class Solution {
    public String orderlyQueue(String S, int K) {
         if(K>=2){
            char[] ch=S.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }else{
            String s2=S + S;
            for(int i=0;i<S.length();i++){
                String temp=s2.substring(i,i+S.length());
                S=(S.compareTo(temp)>0)?temp:S;
            }
        }
        return S;
    }
}