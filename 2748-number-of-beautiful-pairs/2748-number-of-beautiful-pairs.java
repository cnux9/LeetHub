class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] primes = new int[] {2, 3, 5, 7};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println("pow: " + Math.pow(10, (int)Math.log10(nums[i])));
                int val1 = nums[i] / (int)Math.pow(10, (int)Math.log10(nums[i]));
                int val2 = nums[j] % 10;

                // System.out.println(val1 + " " + val2);
                boolean isCoprime = true;
                for (int p : primes) {
                    if (val1 % p == 0 && val2 % p == 0) {
                        // System.out.println(val1 + " " + val2 + " " + p + " suc!");
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