class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if (strs[0].equals("")) {
        //     return "";
        // }
        int l = strs[0].length();
        for (String s : strs) {
            if (l > s.length()) {
                l = s.length();
            }
            for (int i = 0; i < l; i++) {
                if (strs[0].charAt(i) != s.charAt(i)) {
                    l = i;
                    break;
                }
            }
        }
        return strs[0].substring(0, l);
    }
}