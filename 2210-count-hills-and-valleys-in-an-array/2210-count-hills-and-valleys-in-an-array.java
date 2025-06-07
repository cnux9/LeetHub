class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        Boolean isDownhill = null;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] > nums[i]) {
                isDownhill = true;
            } else if (nums[i-1] < nums[i]) {
                isDownhill = false;
            }
            if (isDownhill == null) {
                continue;
            }
            if (isDownhill && nums[i+1] > nums[i]) {
                count++;
            } else if (!isDownhill && nums[i+1] < nums[i]) {
                count++;
            }
        }
        return count;
    }
}