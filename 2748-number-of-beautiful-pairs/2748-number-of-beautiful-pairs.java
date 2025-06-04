class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] primes = new int[] {2, 3, 5, 7};

        boolean[][][] digits = new boolean[nums.length][2][4];
        for (int i = 0; i < nums.length; i++) {
            int val1 = nums[i];
            while (val1 >= 10) {
                val1 /= 10;
            }
            int val2 = nums[i] % 10;

            for(int j = 0; j < primes.length; j++) {
                digits[i][0][j] = (val1 % primes[j] == 0);
                digits[i][1][j] = (val2 % primes[j] == 0);
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                boolean isCoprime = true;
                for (int k = 0; k < digits[0][0].length; k++) {
                    if (digits[i][0][k] && digits[j][1][k]) {
                        isCoprime = false;
                        break;
                    }
                }
                if (isCoprime) {
                    count++;
                }
            }
        }
        return count;
    }
}