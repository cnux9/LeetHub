class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (; k > 0; k--) {
            int minValue = nums[0];
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < minValue) {
                    minValue = nums[i];
                    minIndex = i;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}