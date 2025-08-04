class Solution {
    public int sumOfUnique(int[] nums) {
        int[] all_nums = new int[100];
        Arrays.fill(all_nums, 0);
        for (int n : nums) {
            all_nums[n - 1]++;
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (all_nums[i] == 1) {
                sum += i + 1;
            }
        }
        return sum;
    }
}