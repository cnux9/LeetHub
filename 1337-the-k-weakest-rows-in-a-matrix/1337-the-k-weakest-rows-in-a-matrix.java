class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        Arrays.fill(result, -1);
        int count = 0;
        int maxIndex = 0;
        while (count != k) {
            maxIndex = -1;
            for (int i = 0; i < mat.length; i++) {
                boolean isInResult = false;
                for (int j : result) {
                    // System.out.println(i + " " + j);
                    if (i == j) {
                        // System.out.println(i + " " + j + " suc!");
                        isInResult = true;
                        break;
                    }
                }
                if (isInResult == true) {
                    continue;
                }
                if (maxIndex == -1) {
                    maxIndex = i;
                    continue;
                }
                if (!isWeakerThan(mat[maxIndex], mat[i])) {
                    maxIndex = i;
                }
            }
            result[count] = maxIndex;
            // System.out.println(maxIndex + "--------------------------");
            // for (int t : result) {
            //     System.out.print(t + " ");
            // }
            // System.out.println("--------------------------");
            count++;
        }
        return result;
    }

    private boolean isWeakerThan(int[] line1, int[] line2) {
        for (int i = 0; i < line1.length; i++) {
            if (line1[i] == 0) {
                return true;
            }
            if (line2[i] == 0) {
                return false;
            }
        }
        return true;
    }
}