class Solution {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i1 = 0; i1 < nums.length; i1++) {
            for (int i2 = i1 + 1; i2 < nums.length; i2++) {
                for (int i3 = i2 + 1; i3 < nums.length; i3++) {
                    if (nums[i2] * nums[i3] % nums[i1] == 0) {
                        int target = nums[i2] * nums[i3] / nums[i1];
                        if (target <= nums[nums.length-1]) {
                            int pos = Arrays.binarySearch(nums, i3 + 1, nums.length, target);
                            if (pos > 0) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count * 8;
    }
}