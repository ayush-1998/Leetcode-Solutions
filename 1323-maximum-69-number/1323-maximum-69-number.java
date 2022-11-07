class Solution {

    public int maximum69Number(int num) {
        String s = num + "";
        StringBuilder sb = new StringBuilder(s);
        int flag = 1;
        for (int i = 0; i < sb.length(); i++) {
            if (flag == 1) {
                if (sb.charAt(i) == '6') {
                    sb.setCharAt(i, '9');
                    flag = 0;
                }
            }
        }
        s = sb.toString();
        return Integer.parseInt(s);
    }
}
