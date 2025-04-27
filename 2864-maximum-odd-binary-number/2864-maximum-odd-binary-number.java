class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1"; 
    }
}