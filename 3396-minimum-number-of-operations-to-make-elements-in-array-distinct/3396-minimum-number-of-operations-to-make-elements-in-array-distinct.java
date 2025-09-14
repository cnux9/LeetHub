class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] bools = new boolean[100];
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(bools[nums[i] - 1]);
            if (bools[nums[i] - 1] == true) {
                return (i + 1) / 3 + ((i + 1) % 3 > 0 ? 1 : 0);
            }
            bools[nums[i] - 1] = true;
        }
        return 0;
    }
}