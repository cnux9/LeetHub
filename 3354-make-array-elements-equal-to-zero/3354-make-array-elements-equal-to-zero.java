class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            }
            if (isValid(nums.clone(), i, true)) {
                count++;
            }
            if (isValid(nums.clone(), i, false)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(int[] nums, int curr, boolean isRight) {
        int sum1 = 0;
        for (int i = 0; i < curr; i++) {
            sum1 += nums[i];
        }
        int sum2 = 0;
        for (int i = curr + 1; i < nums.length; i++) {
            sum2 += nums[i];
        }
        if (isRight) {
            int diff = sum2 - sum1;
            return 0 <= diff && diff <= 1;
        } else {
            int diff = sum1 - sum2;
            return 0 <= diff && diff <= 1;
        }
    }
}