class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = colors.length - 1; j > i; j--) {
                if (colors[i] != colors[j]) {
                    int diff = j - i;
                    if (diff > max) {
                        max = diff;
                    }
                    break;
                }
            }
        }
        return max;
    }
}