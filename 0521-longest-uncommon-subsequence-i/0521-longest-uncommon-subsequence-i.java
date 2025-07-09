class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length() ? a.length() : b.length();
        }
        int length = a.length();
        for (int l = length - 1; l > 0; l--) {
            for (int i = 0; i < length - l; i++) {
                if (!b.contains(a.substring(i, i + l))) {
                    return l + 1;
                }
            }
        }
        return -1;
    }
}