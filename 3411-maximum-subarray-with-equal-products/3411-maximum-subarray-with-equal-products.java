class Solution {
    static final int[][] PRIME_EXP = {
        {0,0,0,0},
        {1,0,0,0},
        {0,1,0,0},
        {2,0,0,0},
        {0,0,1,0},
        {1,1,0,0},
        {0,0,0,1},
        {3,0,0,0},
        {0,2,0,0},
        {1,0,1,0}
    };

    int[] nums;

    public int maxLength(int[] nums) {
        this.nums = nums;

        for (int len = nums.length; len > 0; len--) {
            int[] indices = new int[len];
            for (int i = 0; i < indices.length; i++) {
                indices[i] = i;
            }

            for (int i = 0; i + len - 1 < nums.length; i++) {
                if (isValidArr(i, i + len)) {
                    return len;
                }

            }
        }
        return -1;
    }

    private boolean isValidArr(int start, int end) {

        int product = 1;

        int[] countArr = new int[] {0, 0, 0, 0};
        int[][] countExpArr = new int[][] {{0, 0, 0, 0}, {0, 0, 0}, {0, 0}, {0, 0}};
        for (int i = start; i < end; i++) {
            int[] returnedPrimes = PRIME_EXP[nums[i] - 1];
            // System.out.println("returnedPrimes: " + n + " -> " + Arrays.toString(returnedPrimes));

            for (int j = 0; j < countArr.length; j++) {
                countArr[j] += returnedPrimes[j];

                countExpArr[j][returnedPrimes[j]]++;
                if (returnedPrimes[j] != 0 && countExpArr[j][returnedPrimes[j]] > 2) {
                    // System.out.println("=========" + start + ", " + end);
                    return false;
                }
            }
        }
        
        for (int i = 0; i < countArr.length; i++) {

            int count = 0;
            int countAll = 0;
            for (int j = 0; j < countExpArr[i].length; j++) {
                if (countExpArr[i][j] > 0) {
                    count++;
                    if (j != 0) {
                        countAll += countExpArr[i][j];
                    }
                }
            }
            // System.out.println("count : " + count + ", " + countAll);
            if (count > 2) {
                // System.out.println("false1 : " + start + ", " + end);
                return false;
            }
            if (count == 2 && countAll > 2) {
                // System.out.println("false2 : " + start + ", " + end);

                return false;
            }
            // if (count == 2 && countAll == 2 && countExpArr[i][0] == 0 ) {
            //     return false;
            // }
            if (count == 2 && countAll == 2 && countExpArr[i][0] != 0 ) {
                return false;
            }
            if (count == 2 && countAll == 2) {
                for (int j = 1; j < countExpArr[i].length; j++) {
                    if (countExpArr[i][j] > 1) {
                        // System.out.println("false2 : " + start + ", " + end);
                        return false;
                    }
                }
            }
            if (count == 1 && countExpArr[i][0] == 0 && countAll != 2) {
                // System.out.println("false3 : " + start + ", " + end);

                return false;
            }
        }

        return true;
    }
}