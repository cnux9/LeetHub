class Solution {
    public String removeTrailingZeros(String num) {
        char[] charArray = num.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != '0') {
                break;
            }
        }
        for (int j = 0; j <= i; j++) {
            sb.append(charArray[j]);
        }
        return sb.toString();
    }
}