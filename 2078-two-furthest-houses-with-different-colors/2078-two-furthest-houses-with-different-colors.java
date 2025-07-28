class Solution {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = i + max + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    int diff = j - i;
                    if (diff > max) {
                        max = diff;
                    }
                    // break;
                }
            }
        }
        return max;
    }
}