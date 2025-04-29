class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            if (min > n) {
                min = n;
            } else if (max < n) {
                max = n;
            }
        }
        // System.out.println(max + " " + min);
        for (int i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {
                // System.out.println(i);
                return i;
            }
        }
        
        return 1;
    }
}