class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (left <= right) {
            if (c[left] == '1') {
                left++;
            }

            if (c[right] == '0') {
                right--;
            }

            if (left <= right && c[left] == '0' && c[right] == '1') {
                c[left] = '1';
                c[right] = '0';
            }
        }

        c[left - 1] = '0';
        c[c.length - 1] = '1';
        
        return String.valueOf(c);
    }
}