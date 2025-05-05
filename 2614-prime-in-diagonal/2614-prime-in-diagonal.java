class Solution {

    public int diagonalPrime(int[][] nums) {
        // System.out.println(nums.length + " " + nums[0].length);
        // primeDict.put(1, false);
        // primeList.add(2);

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i][i];
            if (max < target) {
                max = target;
            }
            target = nums[nums.length - i - 1][i];
            if (max < target) {
                max = target;
            }
        }

        boolean[] isPrime = sieve(max);

        int maxPrime = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i][i];
            if (maxPrime < target && isPrime[target]) {
                maxPrime = target;
            }
            target = nums[nums.length - i - 1][i];
            if (maxPrime < target && isPrime[target]) {
                maxPrime = target;
            }
        }
        return maxPrime;
    }

    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}