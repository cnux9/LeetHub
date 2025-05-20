class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int val = nums[j] - nums[i];
                if (max < val) {
                    // System.out.println(max + " " + val + " // " + i +  " : " + j);
                    max = val;
                }
            }
        }
        return max > 0 ? max : -1;
    }
}