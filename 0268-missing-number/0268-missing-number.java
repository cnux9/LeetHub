class Solution {
    public int missingNumber(int[] nums) {
        int rest = nums.length * (nums.length + 1) / 2;
        for (int n : nums) {
            rest -= n;
        }
        return rest;
    }
}