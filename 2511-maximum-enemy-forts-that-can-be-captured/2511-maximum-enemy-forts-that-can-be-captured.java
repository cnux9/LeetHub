class Solution {
    public int captureForts(int[] forts) {
        int max = 0;
        int count = 0;
        int prev = 0;
        for (int fort : forts) {
            if (fort == 1 || fort == -1) {
                if (prev == 0) {
                    prev = fort;
                } else if (prev == fort * -1) {
                    if (max < count) {
                        max = count;
                    }
                    prev = fort;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return max;
    }
}