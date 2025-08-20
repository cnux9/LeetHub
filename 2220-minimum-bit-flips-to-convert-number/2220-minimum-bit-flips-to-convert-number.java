class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while (start > 0 || goal > 0) {
            int s = start % 2;
            int g = goal % 2;

            start /= 2;
            goal /= 2;

            if (s != g) {
                count++;
            }
        }
        return count;
    }
}