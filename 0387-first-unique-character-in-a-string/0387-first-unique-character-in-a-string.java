class Solution {
    public int firstUniqChar(String s) {
        if (s.isEmpty())
			return -1;

		int[] count = new int[26];
		for (int i = s.length() - 1; i >= 0; i--) {
			count[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if(count[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
    }
}