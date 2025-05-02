class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int x = 0;
        int y = 0;
        for (int[] row : mat) {
            for (int field : row) {
                // System.out.println(field + " "  + x + " " + y);
                result[x][y] = field;
                if (x == r-1) {
                    x = 0;
                    y++;
                } else {
                    x++;
                }
            }
        }

        return result;
    }
}