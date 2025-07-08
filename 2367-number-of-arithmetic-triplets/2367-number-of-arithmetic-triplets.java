class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = Arrays.binarySearch(nums, nums[i] + diff);
        }
        nums[nums.length - 1] = -1;
        for (int i = 0; i < nums.length - 2; i++) {
            // if (nums[i] + diff + diff > nums[nums.length - 1]) {
            //     break;
            // }
            int v = nums[i];
            if (v >= 0 && nums[v] >= 0) {
                count++;
            }
        }
        return count;
    }
}