class Solution {
    int[] primes = new int[] {2, 3, 5, 7};
    int[][] primeArr;

    public int maxLength(int[] nums) {
        primeArr = new int[nums.length][];

        for (int i = 0; i < nums.length; i++) {
            primeArr[i] = getPrimes(nums[i]);
        }

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

        int[] countArr = primeArr[start].clone();
        int[] gcdArr = primeArr[start].clone();
        int[] lcmArr = primeArr[start].clone();
        for (int i = start + 1; i < end; i++) {
            int[] returnedPrimes = primeArr[i];
            // System.out.println("returnedPrimes: " + n + " -> " + Arrays.toString(returnedPrimes));

            for (int j = 0; j < countArr.length; j++) {
                countArr[j] += returnedPrimes[j];
                // if (countArr[j] > 2) {
                //     return false;
                // }

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

        for (int i = 0; i < primes.length; i++) {
            lcmArr[i] += gcdArr[i];
            if (lcmArr[i] != countArr[i]) {
                return false;
            }
        }

        return true;
    }

    // 8 -> {3, 0, 0, 0}
    private int[] getPrimes(int n) {
        int[] countArr = new int[] {0, 0, 0, 0};

        int q = n;
        int i = 0;
        while (q > 1) {
            int p = primes[i];
            if (q % p == 0) {
                countArr[i]++;
                q /= p;
            } else {
                i++;
            }
        }
        return countArr;
    }
}