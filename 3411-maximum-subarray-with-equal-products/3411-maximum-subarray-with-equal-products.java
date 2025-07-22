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
                    // System.out.println("valid!");
                    return len;
                }

            }
        }
        return -1;
    }

    private boolean isValidArr(int start, int end) {
        // System.out.println("isValidArr: " + start + ", " + end);

        int product = 1;

        int[] countArr = new int[] {0, 0, 0, 0};
        int[][] countExpArr = new int[][] {{0, 0, 0, 0}, {0, 0, 0}, {0, 0}, {0, 0}};
        int[] gcdArr = new int[] {4, 4, 4, 4};
        int[] lcmArr = new int[] {0, 0, 0, 0};
        for (int i = start; i < end; i++) {
            if (nums[i] == 1) {
                gcdArr[0] = 0;
                gcdArr[1] = 0;
                gcdArr[2] = 0;
                gcdArr[3] = 0;
                continue;
            }
            int[] returnedPrimes = PRIME_EXP[nums[i] - 1];
            // System.out.println("returnedPrimes: " + n + " -> " + Arrays.toString(returnedPrimes));

            for (int j = 0; j < countArr.length; j++) {
                countArr[j] += returnedPrimes[j];

                countExpArr[j][returnedPrimes[j]]++;
                if (returnedPrimes[j] != 0 && countExpArr[j][returnedPrimes[j]] > 2) {
                    // System.out.println("=========" + start + ", " + end);
                    return false;
                }

                // gcd
                if (gcdArr[j] > returnedPrimes[j]) {
                    gcdArr[j] = returnedPrimes[j];
                }

                // lcm
                if (lcmArr[j] < returnedPrimes[j]) {
                    lcmArr[j] = returnedPrimes[j];
                }
            }
        }

        // System.out.println("countArr: " + Arrays.toString(countArr));
        // System.out.println("gcdArr: " + Arrays.toString(gcdArr));
        // System.out.println("lcmArr: " + Arrays.toString(lcmArr));

        // System.out.println("=========" + start + ", " + end);
        // if (end - start == 2) {
        //     return true;
        // } else {
        //     for (int p : gcdArr) {
        //         System.out.println("gcd : " + p);
        //         if (p != 0 && p != 4) {
        //             System.out.println("====prime is not valid");
        //             return false;
        //         }
        //     }
        //     System.out.println();
        //     for (int p : lcmArr) {
        //         System.out.println("lcm : " + p);
        //         if (p != 0 && p != 1) {
        //             System.out.println("====prime is not valid");
        //             return false;
        //         }
        //     }
        //     System.out.println();
        // }
        
        for (int i = 0; i < countArr.length; i++) {
            if (gcdArr[i] != 4) {
                lcmArr[i] += gcdArr[i];
            }
            if (lcmArr[i] != countArr[i]) {
                return false;
            }
        }

        return true;
    }
}