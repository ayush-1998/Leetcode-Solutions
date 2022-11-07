class Solution {

    public int maximum69Number(int num) {
      
// 	    /*Using StringBuilder - Slowest*/
//         StringBuilder n = new StringBuilder(num+"");
//         for(int i = 0; i < n.length(); i++) {
//             if(n.charAt(i) == '6') {
//                 n.setCharAt(i, '9');
//                 return Integer.parseInt(n.toString());
//             }
//         }
//         return num;
//     }
     
        /*Convert to char array and then convert back to int*/
        String s = Integer.toString(num);
        char[] ch = s.toCharArray();
        for(int i=0; i< ch.length; i++) {
                if(ch[i] == '6') {
                    ch[i]='9';
                    return Integer.parseInt(String.valueOf(ch));
                }
        }
        return num;
    }
}
