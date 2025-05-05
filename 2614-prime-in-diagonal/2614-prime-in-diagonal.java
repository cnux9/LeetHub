class Solution {
    private Map<Integer, Boolean> primeDict = new HashMap<>();

    public int diagonalPrime(int[][] nums) {
        // System.out.println(nums.length + " " + nums[0].length);
        primeDict.put(1, false);
        primeDict.put(2, true);

        int maxPrime = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i][i];
            if (isPrime(target)) {
                if (maxPrime < target) {
                    maxPrime = target;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int target = nums[nums.length - i - 1][i];
            if (maxPrime < target) {
                if (isPrime(target)) {
                    maxPrime = target;
                }
            }
        }
        return maxPrime;
    }

    private boolean isPrime(int target) {
        if (primeDict.containsKey(target)) {
            return primeDict.get(target);
        }
        if (target % 2 == 0) {
            return false;
        }
        for (int i = 3; i < target; i+=2) {
            if (target % i == 0) {
                primeDict.put(target, false);
                return false;
            }
        }
        primeDict.put(target, true);
        return true;
    }
}