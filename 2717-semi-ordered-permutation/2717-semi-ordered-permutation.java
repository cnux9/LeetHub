class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                first = i;
            } else if (nums[i] == nums.length) {
                last = i;
            }
        }
        return first + (nums.length - last - 1) + (first > last ? -1 : 0);
    }
}