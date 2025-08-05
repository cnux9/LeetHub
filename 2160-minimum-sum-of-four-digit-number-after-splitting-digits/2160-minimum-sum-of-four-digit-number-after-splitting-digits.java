class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(nums);

        int val1 = (nums[0] + nums[1]) * 10 + nums[2] + nums[3];
        int val2 = nums[0] * 100 + nums[1] * 10 + nums[2] + nums[3];
        return val1 > val2 ? val2 : val1;
    }
}