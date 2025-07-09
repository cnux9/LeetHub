class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length() ? a.length() : b.length();
        }
        int length = a.length();
        for (int l = length - 1; l > 0; l--) {
            for (int i = 0; i < length - l; i++) {
                for (int j = 0; j < length - l; j++) {
                    boolean isDifferent = false;
                    for (int k = 0; k <= l; k++) {
                        if (a.charAt(i + k) != b.charAt(j + k)) {
                            isDifferent = true;
                            break;
                        }
                    }
                    if (isDifferent) {
                        return l + 1;
                    }
                }
            }
        }
        return -1;
    }
}