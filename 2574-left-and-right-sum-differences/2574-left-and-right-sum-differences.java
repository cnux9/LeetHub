class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        int left = 0;
        int right = sum;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            right -= n;

            // System.out.println("left: " + left + ", right: " + right);
            int val = left - right;
            if (val < 0) {
                val *= -1;
            }
            result[i] = val;

            left += n;
        }

        return result;
    }
}