class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int firstSneakyNum = 0;
        boolean isFirstValue = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (isFirstValue) {
                        firstSneakyNum = nums[i];
                        isFirstValue = false;
                    } else {
                        return new int[]{firstSneakyNum, nums[i]};
                    }
                }
            }
        }
        return null;
    }
}