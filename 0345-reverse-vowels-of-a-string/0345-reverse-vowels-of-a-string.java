class Solution {

    public boolean isVovel(char[] arr, int idx) {
        char ch = arr[idx];
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && isVovel(arr, left) == false) {
                left++;
            }
            while (left < right && isVovel(arr, right) == false) {
                right--;
            }
            swap(arr, left, right);
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
