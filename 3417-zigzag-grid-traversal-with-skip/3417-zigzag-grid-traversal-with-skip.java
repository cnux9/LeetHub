class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>((grid.length * grid[0].length + 1) / 2);
        int i = 0;
        int j = 0;
        int delta = 1;
        boolean isSkip = false;
        while (j < grid.length) {
            if (!isSkip) {
                result.add(grid[j][i]);
            }
            isSkip = !isSkip;
            if (0 <= i + delta && i + delta < grid[0].length) {
                i += delta;
            } else {
                j++;
                delta *= -1;
            }
        }
        return result;
    }
}