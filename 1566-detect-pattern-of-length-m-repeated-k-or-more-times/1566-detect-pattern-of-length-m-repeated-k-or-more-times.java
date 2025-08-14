class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = m * k - 1; i < arr.length; i++) {
            boolean isPattern = true;
            for (int j = 0; j < m; j++) {
                for (int n = 1; n < k; n++) {
                    if (arr[i + j + 1 - m * (n + 1)] != arr[i + j + 1 - m * 1]) {
                        isPattern = false;
                        break;
                    }
                }
                if (!isPattern) {
                    break;
                }
            }
            if (isPattern == true) {
                return true;
            }
        }
        return false;
    }
}