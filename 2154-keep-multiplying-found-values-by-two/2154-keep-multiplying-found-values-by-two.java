class Solution {
    public int findFinalValue(int[] nums, int original) {
        for (int n : nums) {
            if (original == n) {
                return findFinalValue(nums, original * 2);
            }
        }
        return original;
    }
}