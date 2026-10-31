package LEETCODE(11-20);
class Q2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        char[] arr = word.toCharArray();

        int left = 0;
        int right = index;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}