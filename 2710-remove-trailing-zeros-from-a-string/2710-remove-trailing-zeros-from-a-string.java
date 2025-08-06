class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) != '0') {
                break;
            }
        }
        for (int j = 0; j <= i; j++) {
            sb.append(num.charAt(j));
        }
        return sb.toString();
    }
}