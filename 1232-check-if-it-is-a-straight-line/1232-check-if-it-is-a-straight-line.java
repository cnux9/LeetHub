class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] slope = new int[] {(coordinates[1][0] - coordinates[0][0]), (coordinates[1][1] - coordinates[0][0])};
        for (int i = 2; i < coordinates.length; i++) {
            int num = coordinates[i][0] - coordinates[i - 1][0];
            int den = coordinates[i][1] - coordinates[i - 1][0];
            if (slope[0] * den != slope[1] * num) {
                return false;
            }
        }
        return true;
    }
}