class Solution {
    char[] charArray;

    public String removeDigit(String number, char digit) {
        charArray = number.toCharArray();
        int lastIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == digit) {
                if (i != charArray.length - 1 && charArray[i+1] > digit) {
                    return getRemovedString(i);
                }
                lastIndex = i;
            }
        }
        return getRemovedString(lastIndex);
    }

    private String getRemovedString(int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (index != i) {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }
}