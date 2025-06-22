class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for (int i : gain) {
            altitude += i;
            if (max < altitude) {
                max = altitude;
            }
        }
        return max;
    }
}