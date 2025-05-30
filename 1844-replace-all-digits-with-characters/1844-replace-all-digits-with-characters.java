class Solution {
    public String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i+=2) {
            charArray[i] += charArray[i-1] - 48;
        }
        return String.valueOf(charArray);
    }
}