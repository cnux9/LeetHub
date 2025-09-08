class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] charArray = strs[0].toCharArray();
        int l = strs[0].length();
        for (String s : strs) {
            if (l > s.length()) {
                l = s.length();
            }
            for (int i = 0; i < l; i++) {
                if (charArray[i] != s.charAt(i)) {
                    l = i;
                    break;
                }
            }
        }
        return strs[0].substring(0, l);
    }
}