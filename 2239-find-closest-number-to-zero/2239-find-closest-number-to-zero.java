class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0] < 0 ? -nums[0] : nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i] < 0 ? -nums[i] : nums[i];
            if (closest > val) {
                closest = val;
                result = nums[i];
            } else if (closest == val) {
                if (result < nums[i]) {
                    result = nums[i];
                }
            }
        }
        return result;
    }
}