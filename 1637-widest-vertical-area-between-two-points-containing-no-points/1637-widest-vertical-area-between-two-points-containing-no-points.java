class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> x = new HashSet<>();
        for (int[] p : points) {
            x.add(p[0]);
        }

        Integer[] xArray = x.toArray(new Integer[x.size()]);
        Arrays.sort(xArray);
        
        int max = 0;
        for (int i = 1; i < xArray.length; i++) {
            int diff = xArray[i] - xArray[i-1];
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }
}