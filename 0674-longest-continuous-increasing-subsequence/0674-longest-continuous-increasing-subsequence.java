class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            // if (nums.length - i + count < max) {
            //     return max;
            // }
            int n = nums[i];
            if (n > prev) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
            prev = n;
        }
        if (count > max) {
            max = count;
        }
        count = 1;
        return max;
    }
}