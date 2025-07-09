class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length() ? a.length() : b.length();
        }
        int length = a.length();
        for (int l = length - 1; l > 0; l--) {
            for (int i = 0; i < length - l; i++) {
                boolean hasSubsequence = false;
                for (int j = 0; j < length - l; j++) {
                    boolean isSame = true;
                    for (int k = 0; k <= l; k++) {
                        if (a.charAt(i + k) != b.charAt(j + k)) {
                            isSame = false;
                            break;
                        }
                    }
                    if (isSame) {
                        hasSubsequence = true;
                        break;
                    }
                }
                if (!hasSubsequence) {
                    return l + 1;
                }
            }
        }
        return -1;
    }
}