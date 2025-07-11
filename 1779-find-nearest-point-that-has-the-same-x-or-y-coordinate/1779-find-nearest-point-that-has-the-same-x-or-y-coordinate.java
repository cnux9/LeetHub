class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = -1;
        int index = -1;
        boolean isFirst = true;
        for (int i = 0; i < points.length; i++) {
            int px = points[i][0];
            int py = points[i][1];
            if (x == px || y == py) {
                int distance = Math.abs(x - px) + Math.abs(y - py);
                if (isFirst || distance < min) {
                    min = distance;
                    isFirst = false;
                    index = i;
                }
            }
        }
        return index;
    }
}