class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int c1 = start;
        int c2 = start;
        int d1 = 0;
        int d2 = 0;
        while (true) {
            if (d1 > d2) {
                d2 += distance[c2];
                c2++;
                if (c2 == distance.length) {
                    c2 = 0;
                }
                if (c2 == destination) {
                    return d2;
                }
            } else {
                if (c1 == 0) {
                    c1 = distance.length;
                }
                d1 += distance[c1 - 1];
                c1--;
                if (c1 == destination) {
                    return d1;
                }
            }
        }
    }
}